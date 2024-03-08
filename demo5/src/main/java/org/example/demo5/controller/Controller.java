package org.example.demo5.controller;

import org.example.demo5.model.Computer;
import org.example.demo5.service.IComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/computer")
public class Controller {

    @Autowired
    private IComputerService iComputerService;

    @GetMapping
    public ResponseEntity<Iterable<Computer>> findAllCustomer(@PageableDefault(value = 2) Pageable pageable) {
        Page<Computer> staffList = iComputerService.findAll(pageable);
        if (staffList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(staffList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Computer> findCustomerById(@PathVariable  int id) {
        Optional<Computer> customerOptional = iComputerService.findById(id);
        if (!customerOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customerOptional.get(), HttpStatus.OK);
    }
    @GetMapping("/searchName")
    public ResponseEntity<List<Computer>> searchProducts(@RequestParam("name") String name){
        return ResponseEntity.ok(iComputerService.searchName(name));
    }
    @GetMapping("/searchBrand")
    public ResponseEntity<List<Computer>> searchBrand(@RequestParam("brand") String brand){
        return ResponseEntity.ok(iComputerService.searchBrand(brand));
    }
    @GetMapping("/searchKind")
    public ResponseEntity<List<Computer>> searchKind(@RequestParam("kind") String kind){
        return ResponseEntity.ok(iComputerService.searchKind(kind));
    }

    @PostMapping
    public ResponseEntity<Computer> saveCustomer(@RequestBody Computer computer) {
        iComputerService.save(computer);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Computer> updateCustomer(@PathVariable int id, @RequestBody Computer computer) {
        Optional<Computer> staffOptional = iComputerService.findById(id);
        if (!staffOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        computer.setId(staffOptional.get().getId());
        iComputerService.save(computer);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Computer> deleteCustomer(@PathVariable int id) {
        Optional<Computer> customerOptional = iComputerService.findById(id);
        if (!customerOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iComputerService.delete(id);
        return new ResponseEntity<>(customerOptional.get(), HttpStatus.OK);
    }
}

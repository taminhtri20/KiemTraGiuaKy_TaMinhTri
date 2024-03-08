package org.example.demo4.controller;


import org.example.demo4.model.Staff;
import org.example.demo4.service.IStaffService;
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
@RequestMapping("/api/staff")
public class Controller {

    @Autowired
    private IStaffService iStaffService;

    @GetMapping
    public ResponseEntity<Iterable<Staff>> findAllCustomer(@PageableDefault(value = 5) Pageable pageable) {
        Page<Staff> staffList = iStaffService.findAll(pageable);
        if (staffList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(staffList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Staff> findCustomerById(@PathVariable int id) {
        Optional<Staff> customerOptional = iStaffService.findById(id);
        if (!customerOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customerOptional.get(), HttpStatus.OK);
    }
    @GetMapping("/searchName")
    public ResponseEntity<List<Staff>> searchProducts(@RequestParam("name") String name){
        return ResponseEntity.ok(iStaffService.searchName(name));
    }
    @GetMapping("/searchAge")
    public ResponseEntity<List<Staff>> searchAge(@RequestParam("age") String age){
        return ResponseEntity.ok(iStaffService.SearchAge(age));
    }
    @GetMapping("/searchAddress")
    public ResponseEntity<List<Staff>> searchAddress(@RequestParam("address") String address){
        return ResponseEntity.ok(iStaffService.searchAddress(address));
    }

    @PostMapping
    public ResponseEntity<Staff> saveCustomer(@RequestBody Staff staff) {
        iStaffService.save(staff);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Staff> updateCustomer(@PathVariable int id, @RequestBody  Staff staff) {
        Optional<Staff> staffOptional = iStaffService.findById(id);
        if (!staffOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        staff.setId(staffOptional.get().getId());
        iStaffService.save(staff);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Staff> deleteCustomer(@PathVariable  int id) {
        Optional<Staff> customerOptional = iStaffService.findById(id);
        if (!customerOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iStaffService.delete(id);
        return new ResponseEntity<>(customerOptional.get(), HttpStatus.OK);
    }
}
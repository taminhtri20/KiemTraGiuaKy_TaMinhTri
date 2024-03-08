package org.example.demo5.service;

import org.example.demo5.model.Computer;
import org.example.demo5.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ComputerService implements IComputerService{
    @Autowired
    ComputerRepository computerRepository;
    @Override
    public Page<Computer> findAll(Pageable pageable) {
        return computerRepository.findAll(pageable);
    }

    @Override
    public Optional<Computer> findById(int id) {
        return computerRepository.findById(id);
    }

    @Override
    public void save(Computer computer) {
        computerRepository.save(computer);
    }

    @Override
    public void delete(int id) {
        computerRepository.deleteById(id);
    }

    @Override
    public List<Computer> searchName(String name) {
        return computerRepository.findAllByNameContains(name);
    }

    @Override
    public List<Computer> searchBrand(String brand) {
        return computerRepository.findAllByBrandContains(brand);
    }

    @Override
    public List<Computer> searchKind(String kind) {
        return computerRepository.findAllByKindContains(kind);
    }
}

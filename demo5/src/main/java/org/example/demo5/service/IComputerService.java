package org.example.demo5.service;

import org.example.demo5.model.Computer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IComputerService {
    Page<Computer> findAll(Pageable pageable);
    Optional<Computer> findById(int id);
    void save(Computer computer);
    void delete(int id);
    List<Computer> searchName(String name);
    List<Computer> searchBrand(String brand);
    List<Computer> searchKind(String kind);
}

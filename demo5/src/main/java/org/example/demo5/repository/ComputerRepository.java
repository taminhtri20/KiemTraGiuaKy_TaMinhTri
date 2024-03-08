package org.example.demo5.repository;

import org.example.demo5.model.Computer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, Integer> {
    Page<Computer> findAll(Pageable pageable);
    List<Computer> findAllByNameContains(String name);
    List<Computer> findAllByBrandContains(String brand);
    List<Computer> findAllByKindContains(String kind);
}

package org.example.demo4.service;

import org.example.demo4.model.Staff;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IStaffService {
    Page<Staff> findAll(Pageable pageable);
    Optional<Staff> findById(int id);
    void save(Staff staff);
    void delete(int id);
    List<Staff> searchName(String name);
    List<Staff> SearchAge(String date);
    List<Staff> searchAddress(String address);
}

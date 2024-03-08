package org.example.demo4.repository;

import org.example.demo4.model.Staff;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StaffRepository extends JpaRepository<Staff, Integer> {
    Page<Staff> findAll(Pageable pageable);
    List<Staff> findAllByNameContains(String name);
    List<Staff> findAllByDateContains(String date);
    List<Staff> findAllByAddressContains(String address);
}

package org.example.demo4.service;

import org.example.demo4.model.Staff;
import org.example.demo4.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StaffService implements IStaffService{
    @Autowired
    StaffRepository staffService;
    @Override
    public Page<Staff> findAll(Pageable pageable) {
        return staffService.findAll(pageable);
    }

    @Override
    public Optional<Staff> findById(int id) {
        return staffService.findById(id);
    }

    @Override
    public void save(Staff staff) {
        staffService.save(staff);
    }

    @Override
    public void delete(int id) {
        staffService.deleteById(id);
    }

    @Override
    public List<Staff> searchName(String name) {
        return staffService.findAllByNameContains(name);
    }

    @Override
    public List<Staff> SearchAge(String date) {
        return staffService.findAllByDateContains(date);
    }

    @Override
    public List<Staff> searchAddress(String address) {
        return staffService.findAllByAddressContains(address);
    }

}

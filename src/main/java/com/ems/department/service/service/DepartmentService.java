package com.ems.department.service.service;

import com.ems.department.service.entity.Department;
import com.ems.department.service.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {
    
    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }
    
    public Optional<Department> getDepartmentById(Long id){
        return departmentRepository.findById(id);
    }
}

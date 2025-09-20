package com.ems.department.service.controller;

import com.ems.department.service.entity.Department;
import com.ems.department.service.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public Department addDepartment(@RequestBody Department department){
        return departmentService.save(department);
    }

    @GetMapping("/{id}")
    public Optional<Department> getDepartment(@PathVariable Long id){
        return departmentService.getDepartmentById(id);
    }

    @GetMapping
    public List<Department> listDepartments(){
        return departmentService.listAll();
    }
}

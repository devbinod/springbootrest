package com.example.demo.controller;

import com.example.demo.domain.Department;
import com.example.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;

@RestController
@RequestMapping("/rest")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping("/d")
    public List<Department> getAll(){

        return departmentRepository.findAll();
    }

    @PostMapping("/d")
    public List<Department> save(@RequestBody Department department){
        System.out.println(department.toString());
        departmentRepository.saveAndFlush(department);

        return departmentRepository.findAll();
    }
}

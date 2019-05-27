package com.example.demo.controller;

import com.example.demo.domain.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rest")
public class EmployeeController {


    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("e")
    public List<Employee> getAll(){

        return employeeRepository.findAll();
    }


    @PostMapping("e")
    public List<Employee> save(@RequestBody Employee employee){
        employeeRepository.saveAndFlush(employee);
        return employeeRepository.findAll();
    }
}

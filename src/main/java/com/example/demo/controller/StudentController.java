package com.example.demo.controller;

import com.example.demo.domain.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/springdemo")
public class StudentController {

    private StudentRepository studentRepository;



    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    public Optional<Student> getSingleStudent(@PathVariable("id") Long id)
    {
       Optional<Student> student = studentRepository.findById(id);
       return student;


    }


    @GetMapping("/students")
    public List<Student> getAllStudent(){
        List<Student> studentList = studentRepository.findAll();
        return studentList;

    }


    @PostMapping("/students")
    public List<Student> addStudent(@RequestBody Student student){
        studentRepository.saveAndFlush(student);

        return studentRepository.findAll();

    }

    @DeleteMapping("/students/{id}")
    public List<Student> deleteStudent(@PathVariable("id") Long id){
        studentRepository.deleteById(id);
        return studentRepository.findAll();


    }

    @PutMapping("/students/{id}")
    public List<Student> updateStudent(@RequestBody Student student, @PathVariable("id") Long id){
        student.setId(id);
        studentRepository.saveAndFlush(student);
        return studentRepository.findAll();
    }

}

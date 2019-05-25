package com.example.demo.controller;

import com.example.demo.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/students/1")
    public Student getSingleStudent()
    {
        return new Student(Long.parseLong("1"),"Binod","Pant");
    }


    @GetMapping("/students")
    public List<Student> getAllStudent(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(Long.parseLong("1"),"Binod","Pant"));
        studentList.add(new Student(Long.parseLong("2"),"Binod","Pant"));
        studentList.add(new Student(Long.parseLong("3"),"Binod","Pant"));
        studentList.add(new Student(Long.parseLong("4"),"Binod","Pant"));
        studentList.add(new Student(Long.parseLong("5"),"Binod","Pant"));
        studentList.add(new Student(Long.parseLong("6"),"Binod","Pant"));
        studentList.add(new Student(Long.parseLong("7"),"Binod","Pant"));
        return studentList;

    }


    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        return student;

    }
    @DeleteMapping("/students/2")
    public void deleteStudent(){

    }

    @PutMapping("/students/2")
    public Student updateStudent(@RequestBody Student student){
        return student;
    }

}

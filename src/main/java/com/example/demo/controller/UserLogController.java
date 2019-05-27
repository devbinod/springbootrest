package com.example.demo.controller;

import com.example.demo.domain.UserLog;
import com.example.demo.repository.UserLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class UserLogController {



    @Autowired
    private UserLogRepository userLogRepository;


    @GetMapping("/userLogs")
    public List<UserLog> getAll(){
        return userLogRepository.findAll();
    }


    @PostMapping("/userLogs")
    public List<UserLog> add(@RequestBody UserLog userLog){

        userLogRepository.saveAndFlush(userLog);
        return userLogRepository.findAll();
    }


    @PutMapping("/userLogs/{id}")
    public List<UserLog> update(@PathVariable("id") Long id, @RequestBody UserLog userLog){

        userLog.setId(id);
        userLogRepository.saveAndFlush(userLog);
        return userLogRepository.findAll();
    }


}

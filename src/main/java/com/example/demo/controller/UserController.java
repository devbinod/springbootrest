package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rest")
public class UserController {

    private UserRepository userRepository;


    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping("/users")
    public List<User> getAllUser(){
        return userRepository.findAll();
    }
  @GetMapping("/users/{id}")
    public Optional<User> getSingleStudent(@PathVariable("id") Long id){
        return userRepository.findById(id);
    }

    @PostMapping("/users")
    public List<User> saveStudent(@RequestBody User user){
        userRepository.saveAndFlush(user);
        return userRepository.findAll();

    }

    @PutMapping("/users/{id}")
    public List<User> updateStudent(@PathVariable("id") Long id, @RequestBody User user ){
        Optional<User> user1 = userRepository.findById(id);
        user.setId(id);
        userRepository.saveAndFlush(user);
        return userRepository.findAll();

    }


    @DeleteMapping("/users/{id}")
    public List<User> deleteStudent(@PathVariable("id") Long id){
        Optional<User> user1 = userRepository.findById(id);
        if(user1.isPresent())
            userRepository.deleteById(id);
        return userRepository.findAll();

    }
}

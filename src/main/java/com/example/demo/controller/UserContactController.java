package com.example.demo.controller;

import com.example.demo.domain.UserContact;
import com.example.demo.repository.UserContactRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rest")
public class UserContactController {

    @Autowired
    private UserContactRepository userContactRepository;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/userContacts")
    public List<UserContact> getAllContact(){
        return userContactRepository.findAll();
    }


    @GetMapping("/userContacts/{id}")
    public Optional<UserContact> getSingleContact(@PathVariable("id") Long id){
        return userContactRepository.findById(id);
    }

    @PostMapping("/userContacts")
    public List<UserContact> saveContact(@RequestBody UserContact userContact){
        userContactRepository.saveAndFlush(userContact);
       return userContactRepository.findAll();
    }


    @DeleteMapping("/userContacts/{id}")
    public List<UserContact> deleteContact(@PathVariable("id") Long id){
        userContactRepository.deleteById(id);
        return userContactRepository.findAll();
    }

    @PutMapping("/userContacts/{id}")
    public List<UserContact> updateStudent(@PathVariable("id") Long id, @RequestBody UserContact userContact){
        userContact.setId(id);
        userContactRepository.saveAndFlush(userContact);
        return userContactRepository.findAll();


    }


}

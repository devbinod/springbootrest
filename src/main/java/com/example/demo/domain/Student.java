package com.example.demo.domain;


import javax.persistence.*;

@Entity

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;

    public Student(Long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }


    public Student() {
    }


    public Long getId() {
        return id;
    }

    public Student setId(Long id) {
        this.id = id;
        return  this;
    }

    public String getFirstname() {
        return firstname;
    }

    public Student setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public Student setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }
}

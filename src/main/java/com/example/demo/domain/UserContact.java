package com.example.demo.domain;

import javax.persistence.*;

@Entity
@Table(name = "user_contact")
public class UserContact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String contactNo;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;


    public UserContact(String contactNo, User user) {
        this.contactNo = contactNo;
        this.user = user;
    }

    public UserContact() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserContact{" +
                "id=" + id +
                ", contactNo='" + contactNo + '\'' +
                ", user=" + user.toString() +
                '}';
    }
}

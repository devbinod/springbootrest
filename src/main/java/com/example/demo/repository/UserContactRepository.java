package com.example.demo.repository;

import com.example.demo.domain.UserContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserContactRepository  extends JpaRepository<UserContact, Long> {


}

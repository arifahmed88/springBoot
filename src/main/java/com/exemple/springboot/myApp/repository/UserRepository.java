package com.exemple.springboot.myApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.springboot.myApp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

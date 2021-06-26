package com.exemple.springboot.myApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.springboot.myApp.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}

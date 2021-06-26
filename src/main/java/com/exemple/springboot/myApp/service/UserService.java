package com.exemple.springboot.myApp.service;

import com.exemple.springboot.myApp.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}

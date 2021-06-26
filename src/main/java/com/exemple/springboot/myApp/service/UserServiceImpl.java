package com.exemple.springboot.myApp.service;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.exemple.springboot.myApp.model.User;
import com.exemple.springboot.myApp.repository.RoleRepository;
import com.exemple.springboot.myApp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public void save(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		roleRepository.findAll().forEach(s->System.out.println(s.getId() + " " + s.getName() + " " + s.getUsers()));
		System.out.println("Roles 2: " + new HashSet<>(roleRepository.findAll()));
		user.setRoles(new HashSet<>(roleRepository.findAll()));
		userRepository.save(user);
	}

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
}

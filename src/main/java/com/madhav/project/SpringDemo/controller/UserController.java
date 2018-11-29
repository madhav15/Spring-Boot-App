package com.madhav.project.SpringDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madhav.project.SpringDemo.model.User;
import com.madhav.project.SpringDemo.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable Long id) {
		return userRepository.findOne(id);
	}
	
	@DeleteMapping("/users/{id}")
	public Boolean deleteUser(@PathVariable Long id) {
		userRepository.delete(id);
		return true;
	}
	
	@PostMapping("/user")
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	@PutMapping("/user")
	public User updateUser(User user) {
		return userRepository.save(user);
	}
	
}

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
import com.madhav.project.SpringDemo.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable Long id) {
		return userService.findOne(id);
	}
	
	@DeleteMapping("/users/{id}")
	public Boolean deleteUser(@PathVariable Long id) {
		return userService.deleteUser(id);
	}
	
	@PostMapping("/user")
	public User createUser(User user) {
		return userService.createUser(user);
	}
	
	@PutMapping("/user")
	public User updateUser(User user) {
		return userService.updateUser(user);
	}
	
}

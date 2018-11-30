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

/**
 * User Rest Controller
 * 
 * @author madhav
 *
 */
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * rest api to get all users.
	 * 
	 * @return list of users.
	 */
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.findAll();
	}

	/**
	 * rest api to get user by id.
	 * 
	 * @return user by id.
	 */
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable Long id) {
		return userService.findOne(id);
	}

	/**
	 * rest api to delete user of the id.
	 * 
	 * @param id
	 *            the user id.
	 * @return true if user deleted otherwise false.
	 */
	@DeleteMapping("/users/{id}")
	public Boolean deleteUser(@PathVariable final Long id) {
		return userService.deleteUser(id);
	}

	/**
	 * rest api to create new user.
	 * 
	 * @param user
	 *            the user object.
	 * @return newly added user object.
	 */
	@PostMapping("/user")
	public User createUser(User user) {
		return userService.createUser(user);
	}

	/**
	 * rest api to update existing user.
	 * 
	 * @param user
	 *            the user object.
	 * @return update user object.
	 */
	@PutMapping("/user")
	public User updateUser(User user) {
		return userService.updateUser(user);
	}

}

package com.madhav.project.SpringDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhav.project.SpringDemo.model.User;
import com.madhav.project.SpringDemo.repository.UserRepository;

/**
 * Implementation of user service.
 * 
 * @author madhav
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	/**
	 * find all users.
	 */
	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	/**
	 * find by id.
	 */
	@Override
	public User findOne(final Long id) {
		return userRepository.findOne(id);
	}

	/**
	 * delete user by id.
	 */
	@Override
	public Boolean deleteUser(final Long id) {
		userRepository.delete(id);
		return true;
	}

	/**
	 * create new user.
	 */
	@Override
	public User createUser(final User user) {
		userRepository.save(user);
		return user;
	}

	/**
	 * update existing user.
	 */
	@Override
	public User updateUser(final User user) {
		userRepository.save(user);
		return user;
	}

}

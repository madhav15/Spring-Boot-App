package com.madhav.project.SpringDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhav.project.SpringDemo.model.User;
import com.madhav.project.SpringDemo.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User findOne(Long id) {
		return userRepository.findOne(id);
	}

	@Override
	public Boolean deleteUser(Long id) {
		userRepository.delete(id);
		return true;
	}

	@Override
	public User createUser(User user) {
		userRepository.save(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		userRepository.save(user);
		return user;
	}

}

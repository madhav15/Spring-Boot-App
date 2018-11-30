package com.madhav.project.SpringDemo.service;

import java.util.List;

import com.madhav.project.SpringDemo.model.User;

/**
 * user service.
 * 
 * @author madhav
 *
 */
public interface UserService {

	List<User> findAll();
		
	User findOne(Long id);
	
	Boolean deleteUser(Long id);
	
	User createUser(User user); 
	
	User updateUser(User user);
	
}

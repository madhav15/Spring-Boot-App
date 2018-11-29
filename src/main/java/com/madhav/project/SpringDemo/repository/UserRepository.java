package com.madhav.project.SpringDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madhav.project.SpringDemo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

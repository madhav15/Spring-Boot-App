package com.madhav.project.SpringDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madhav.project.SpringDemo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

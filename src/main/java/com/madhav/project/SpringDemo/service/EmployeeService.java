package com.madhav.project.SpringDemo.service;

import java.util.List;
import com.madhav.project.SpringDemo.model.Employee;

public interface EmployeeService {

	List<Employee> findAllEmployees();
	
	Employee findById(Long id);
	
	Boolean deleteById(Long id);
	
	Employee createEmployee(Employee employee);
	
	Employee upadetEmployee(Employee employee);
}

package com.madhav.project.SpringDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhav.project.SpringDemo.model.Employee;
import com.madhav.project.SpringDemo.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(final Long id) {
		return employeeRepository.findOne(id);
	}

	@Override
	public Boolean deleteById(final Long id) {
		employeeRepository.delete(id);
		return Boolean.TRUE;
		
	}

	@Override
	public Employee createEmployee(final Employee employee) {
		employeeRepository.save(employee);
		return employee;
	}

	@Override
	public Employee upadetEmployee(final Employee employee) {
		employeeRepository.save(employee);
		return employee;
	}

}

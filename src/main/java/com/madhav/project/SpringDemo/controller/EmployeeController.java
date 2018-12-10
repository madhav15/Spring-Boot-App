package com.madhav.project.SpringDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madhav.project.SpringDemo.model.Employee;
import com.madhav.project.SpringDemo.service.EmployeeService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/rest")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> findAllEmployees() {
		return employeeService.findAllEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public Employee findEmployee(@PathVariable final Long id) {
		return employeeService.findById(id);
	}
	
	@DeleteMapping("/employee/{id}")
	public Boolean deleteUser(@PathVariable final Long id) {
		return employeeService.deleteById(id);
	}

	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody final Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody final Employee employee) {
		return employeeService.upadetEmployee(employee);
	}
}

package com.seed.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seed.dto.EmployeeDto;
import com.seed.entity.Employee;
import com.seed.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class); 
	
	@Autowired
	private EmployeeService empService;
	
	
	@GetMapping("emp")
	public List<EmployeeDto> getEmployees() {
		 List<EmployeeDto> employees = empService.getAllEmployeesDetails();
		 return employees;
	}
	
	
	@PostMapping("add-emp")
	public EmployeeDto addEmployee(@RequestBody EmployeeDto emp) {
		LOGGER.info("employee to be added : {}",emp);
		EmployeeDto addedEmployee = empService.addEmployee(emp);
		return addedEmployee;
	}
	
	@DeleteMapping("delete-emp/{id}")
	public String deleteEmployee(@PathVariable("id") int i) {
		empService.deleteEmployee(i);
		return "Employee delete successfully!";
	}
	
	@PutMapping("update-emp/{id}")
	public EmployeeDto updateEmployee(@PathVariable int id, @RequestBody EmployeeDto emp) {
		return empService.updateEmployee(id, emp);
	}
	
	

}

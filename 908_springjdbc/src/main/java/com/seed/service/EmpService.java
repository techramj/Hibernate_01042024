package com.seed.service;

import java.util.List;

import com.seed.model.Employee;

public interface EmpService {
	
	public Employee addEmployee(Employee emp);
	public Employee getEmployeeDetails(int id);
	public List<Employee> getAllEmployeeDetails();

}

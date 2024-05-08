package com.seed.service;

import java.util.List;

import com.seed.entity.Employee;

public interface EmployeeService {
	
	public Employee addEmployee(Employee emp);
	public Employee updateEmployee(int id, Employee emp);
	public void deleteEmployee(int id);
	public Employee getEmployeeDetails(int id);
	public List<Employee> getAllEmployeesDetails();

}

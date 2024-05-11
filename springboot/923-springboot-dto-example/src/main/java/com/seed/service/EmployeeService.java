package com.seed.service;

import java.util.List;

import com.seed.dto.EmployeeDto;
import com.seed.entity.Employee;

public interface EmployeeService {
	
	public EmployeeDto addEmployee(EmployeeDto emp);
	public EmployeeDto updateEmployee(int id, EmployeeDto emp);
	public void deleteEmployee(int id);
	public EmployeeDto getEmployeeDetails(int id);
	public List<EmployeeDto> getAllEmployeesDetails();

}

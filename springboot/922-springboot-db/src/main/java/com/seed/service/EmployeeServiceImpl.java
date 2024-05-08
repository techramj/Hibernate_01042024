package com.seed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seed.dao.EmployeeDao;
import com.seed.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee addEmployee(Employee emp) {
		
		return employeeDao.save(emp); 
	}

	@Override
	public Employee updateEmployee(int id, Employee emp) {
		emp.setId(id);
		return employeeDao.update(emp);
	}

	@Override
	public void deleteEmployee(int id) {
		employeeDao.delete(id);
		
	}

	@Override
	public Employee getEmployeeDetails(int id) {
		return employeeDao.findById(id);
	}

	@Override
	public List<Employee> getAllEmployeesDetails() {
		return employeeDao.findAll();
	}

}

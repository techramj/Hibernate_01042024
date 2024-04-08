package com.seed.dao;

import java.util.List;

import com.seed.entities.Employee;

public interface EmployeeDao {
	
	Employee save(Employee emp);
	Employee update(Employee emp);
	void delete(int id);
	Employee findById(int id);
	List<Employee> findAll();

}

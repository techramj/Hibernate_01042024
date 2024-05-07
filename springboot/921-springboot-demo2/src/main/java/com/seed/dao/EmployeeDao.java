package com.seed.dao;

import java.util.List;

import com.seed.entity.Employee;

public interface EmployeeDao {
	
	public Employee save(Employee emp);
	public Employee update(Employee emp);
	public void delete(int id);
	public Employee findById(int id);
	public List<Employee> findAll();

}

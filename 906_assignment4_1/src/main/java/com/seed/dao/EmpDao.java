package com.seed.dao;

import java.util.List;

import com.seed.model.Employee;

public interface EmpDao {
	
	public Employee save(Employee emp);
	public Employee findById(int id);
	public List<Employee> findAll();

}

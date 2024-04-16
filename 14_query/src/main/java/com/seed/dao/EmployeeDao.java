package com.seed.dao;

import java.util.List;

import com.seed.entities.Employee;

public interface EmployeeDao {
	
	Employee save(Employee emp);
	Employee update(Employee emp);
	void delete(int id);
	Employee findById(int id);
	Employee findByIdUsingLoad(int id);
	List<Employee> findAll();
	List<Employee> findAllUsingNamedQuery();
	List<Object[]> findAllUsingNativeQuery();
	public List<Employee> findAllUsingNativeQuery1();
	List<Employee> findAllUsingPagination(int pageno, int size);
	List<Employee> findSalaryGreaterThan(double value);
	List<Employee> findEmployeeWithSalary(double value);

}

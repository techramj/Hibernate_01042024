package com.seed.dao;

import java.sql.SQLException;

import com.seed.entity.Employee;

public interface EmpDao {
	public void save(Employee emp) throws SQLException;
	public Employee findById(int id) throws SQLException;
	
	

}

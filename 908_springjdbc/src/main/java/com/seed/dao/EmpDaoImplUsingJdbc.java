package com.seed.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import com.seed.model.Employee;

@Component
public class EmpDaoImplUsingJdbc implements EmpDao{
	
	@Autowired
	private DriverManagerDataSource dataSource;

	public Employee save(Employee emp) {
		System.out.println(this.getClass().getName());
		String sql ="insert into emp11 values (?,?,?)";
		try(PreparedStatement ps = dataSource.getConnection().prepareStatement(sql)){
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setDouble(3, emp.getSalary());
			ps.executeUpdate();
		}catch(SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
		
		return emp;
	}

	public Employee findById(int id) {
		String sql ="select * from emp where id =?";
		return null;
	}

	public List<Employee> findAll() {

		return null;
	}

}

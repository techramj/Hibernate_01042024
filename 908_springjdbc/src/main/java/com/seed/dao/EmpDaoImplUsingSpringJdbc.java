package com.seed.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.seed.model.Employee;

@Component
@Primary
public class EmpDaoImplUsingSpringJdbc implements EmpDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Employee save(Employee emp) {
		System.out.println(this.getClass().getName());
		String sql ="insert into emp11 values (:1, :2, :3)";
		jdbcTemplate.update(sql, emp.getId(), emp.getName(), emp.getSalary());
		return emp;
	}

	@Override
	public Employee findById(int id) {
		String sql = "select id,name,salary from emp11 where id = :id";
		return jdbcTemplate.queryForObject(sql, new EmployeeRowMapper(), id);
	}

	@Override
	public List<Employee> findAll() {
		String sql = "select * from emp11";
		return jdbcTemplate.query(sql, new EmployeeRowMapper());
	}
	
	class EmployeeRowMapper implements RowMapper<Employee>{

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee emp = new Employee();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setSalary(rs.getDouble(3));
			return emp;
		}
		
	}

}

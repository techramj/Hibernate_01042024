package com.seed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seed.dao.EmpDao;
import com.seed.dao.EmpDaoImpl;
import com.seed.model.Employee;

@Component
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpDao empDao;

	public Employee addEmployee(Employee emp) {
		return empDao.save(emp);
	}

	public Employee getEmployeeDetails(int id) {

		return empDao.findById(id);
	}

	public List<Employee> getAllEmployeeDetails() {
		return empDao.findAll();
	}

}

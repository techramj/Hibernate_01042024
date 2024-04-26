package com.seed.service;

import java.util.List;

import com.seed.dao.EmpDao;
import com.seed.dao.EmpDaoImpl;
import com.seed.model.Employee;

public class EmpServiceImpl implements EmpService {

	private EmpDao empDao = new EmpDaoImpl();

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

package com.seed.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.seed.model.Employee;

@Component
public class EmpDaoImpl implements EmpDao {

	private static List<Employee> empList = new ArrayList<Employee>();

	public Employee save(Employee emp) {
		empList.add(emp);
		return emp;
	}

	public Employee findById(int id) {
		for (Employee emp : empList) {
			if (emp.getId() == id) {
				return emp;
			}
		}
		return null;
	}

	public List<Employee> findAll() {
		return empList;
	}

}

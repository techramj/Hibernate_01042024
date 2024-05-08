package com.seed.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.seed.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	public static List<Employee> empList = new ArrayList<Employee>();
	
	static {
		empList.add(Employee.builder().id(1).name("jack").salary(4000).build());
		empList.add(Employee.builder().id(2).name("Jessica").salary(24000).build());
		empList.add(Employee.builder().id(3).name("sam").salary(14000).build());
	}

	@Override
	public Employee save(Employee emp) {
		empList.add(emp);
		return emp;
	}

	@Override
	public Employee update(Employee emp) {
		for(Employee e:empList) {
			if(e.getId() == emp.getId()) {
				e.setName(emp.getName());
				e.setSalary(emp.getSalary());
			}
		}
		return emp;
	}

	@Override
	public void delete(int id) {
		Iterator<Employee> itr = empList.iterator();
		while(itr.hasNext()) {
			Employee emp = itr.next();
			if(emp.getId() == id) {
				itr.remove();
				break;
			}
		}
		
	}

	@Override
	public Employee findById(int id) {
		Iterator<Employee> itr = empList.iterator();
		while(itr.hasNext()) {
			Employee emp = itr.next();
			if(emp.getId() == id) {
				itr.remove();
				return emp;
			}
		}
		return null;
	}

	@Override
	public List<Employee> findAll() {
		return empList;
	}

}

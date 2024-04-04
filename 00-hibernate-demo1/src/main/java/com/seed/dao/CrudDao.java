package com.seed.dao;

import org.hibernate.SessionFactory;

import com.seed.entities.Address;
import com.seed.entities.Employee;
import com.seed.entities.Student;

public class CrudDao {
	private SessionFactory sessionFactory;

	public CrudDao(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	public void addEmployee(Employee emp) {
		//logic to add emp
	}

	public void addStudent(Student stud) {

	}

	public void addAddress(Address address) {

	}

}

package com.seed.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seed.entity.Employee;

@Repository
public class EmployeeDaoImplUsingSF implements EmployeeDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Employee save(Employee emp) {
		try(Session session = sessionFactory.openSession()){
			Transaction tx = session.beginTransaction();
			session.save(emp);
			tx.commit();
		}
		return emp;
	}

	@Override
	public Employee update(Employee emp) {
		try(Session session = sessionFactory.openSession()){
			Transaction tx = session.beginTransaction();
			session.update(emp);
			tx.commit();
		}
		return emp;
	}

	@Override
	public void delete(int id) {
		try(Session session = sessionFactory.openSession()){
			Transaction tx = session.beginTransaction();
			Employee emp = session.get(Employee.class, id);
			session.delete(emp);
			tx.commit();
		}
	}

	@Override
	public Employee findById(int id) {
		try(Session session = sessionFactory.openSession()){
			Transaction tx = session.beginTransaction();
			Employee emp = session.get(Employee.class, id);
			tx.commit();
			return emp;
		}
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> list = new ArrayList<Employee>();
		try(Session session = sessionFactory.openSession()){
			Transaction tx = session.beginTransaction();
			Query query = session.createQuery("from Employee e");
			list.addAll(query.list());
			tx.commit();
		}
		return list;
	}

}

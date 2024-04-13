package com.seed.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seed.dao.EmployeeDao;
import com.seed.entities.Employee;
import com.seed.util.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	@Override
	public Employee save(Employee emp) {
		try (Session session = sessionFactory.openSession()) {
			Transaction tx = session.beginTransaction();
			session.save(emp);
			tx.commit();
		}
		return emp;
	}

	@Override
	public Employee update(Employee emp) {
		try (Session session = sessionFactory.openSession()) {
			Transaction tx = session.beginTransaction();
			session.saveOrUpdate(emp);
			tx.commit();
		}
		return emp;
	}

	@Override
	public void delete(int id) {
		try (Session session = sessionFactory.openSession()) {
			Transaction tx = session.beginTransaction();
			Employee emp = session.get(Employee.class, id);
			//Employee emp = new Employee();
			//emp.setId(id);
			session.delete(emp);
			tx.commit();
		}

	}

	@Override
	public Employee findById(int id) {
		try (Session session = sessionFactory.openSession()) {
			Transaction tx = session.beginTransaction();
			Employee emp = session.get(Employee.class, id);
			tx.commit();
			return emp;
		}
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> employees = new ArrayList<Employee>();
		try (Session session = sessionFactory.openSession()) {
			Transaction tx = session.beginTransaction();
			Query query = session.createQuery("from Employee e");
			employees = query.getResultList();
			tx.commit();
			
		}
		return employees;
	}

}

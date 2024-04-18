package com.seed.dao.impl;

import java.util.List;

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
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub
		return null;
	}

}

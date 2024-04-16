package com.seed.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

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
			session.delete(emp);
			tx.commit();
		}
	}

	@Override
	public Employee findById(int id) {
		Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			Employee emp = session.get(Employee.class, id);
			tx.commit();
			return emp;
	}
	
	@Override
	public Employee findByIdUsingLoad(int id) {
		Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			Employee emp = session.load(Employee.class, id);
			tx.commit();
			return emp;
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

	@Override
	public List<Employee> findAllUsingNamedQuery() {
		List<Employee> employees = new ArrayList<Employee>();
		try (Session session = sessionFactory.openSession()) {
			Transaction tx = session.beginTransaction();
			Query query = session.createQuery("from Employee e");
			employees = query.getResultList();
			tx.commit();
		}
		return employees;
	}

	@Override
	public List<Object[]> findAllUsingNativeQuery() {
		String sql ="select * from emp_14"; //native query
		
		List<Object[]> employees = new ArrayList<>();
		try (Session session = sessionFactory.openSession()) {
			Transaction tx = session.beginTransaction();
			SQLQuery q1 = session.createSQLQuery(sql);
			employees = q1.getResultList();
			tx.commit();
		}
		
		return employees;
	}
	
	@Override
	public List<Employee> findAllUsingNativeQuery1() {
		String sql ="select * from emp_14"; //native query
		
		List<Employee> employees = new ArrayList<>();
		try (Session session = sessionFactory.openSession()) {
			Transaction tx = session.beginTransaction();
			//Query query = session.createSQLQuery(sql);
			
			NativeQuery query = session.createNativeQuery(sql, Employee.class);
			employees = query.getResultList();
			tx.commit();
		}
		
		return employees;
	}
	
	
	

	@Override
	public List<Employee> findAllUsingPagination(int pageno, int size) {
		//if pageno =1 and size = 20
		//pageno =2 and size = 5   6th to 10 record
		int firstResult = (pageno-1)*size +1;
		List<Employee> employees = new ArrayList<Employee>();
		try (Session session = sessionFactory.openSession()) {
			Transaction tx = session.beginTransaction();
			Query query = session.createNamedQuery("get_all_emp", Employee.class);
			query.setFirstResult(firstResult);
			query.setMaxResults(size);
			employees = query.getResultList();
			tx.commit();
		}
		return employees;
	}

	@Override
	public List<Employee> findSalaryGreaterThan(double value) {
		List<Employee> employees = new ArrayList<Employee>();
		try (Session session = sessionFactory.openSession()) {
			Transaction tx = session.beginTransaction();
			Query query = session.createNamedQuery("find_all_with_salary_greater_than", Employee.class);
			query.setParameter("sal", value);
			employees = query.getResultList();
			tx.commit();
		}
		return employees;
	}

	@Override
	public List<Employee> findEmployeeWithSalary(double value) {
		List<Employee> employees = new ArrayList<Employee>();
		try (Session session = sessionFactory.openSession()) {
			Transaction tx = session.beginTransaction();
			Query query = session.createNamedQuery("find_all_with_salary_equals", Employee.class);
			query.setParameter("sal", value);
			employees = query.getResultList();
			tx.commit();
		}
		return employees;
	}

}

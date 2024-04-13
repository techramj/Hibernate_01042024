package com.seed.main;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seed.entities.Employee;
import com.seed.entities.SalesPerson;
import com.seed.entities.WageEmployee;
import com.seed.util.HibernateUtil;

public class ApplicationTest {
	
	public static void main(String[] args) {
		insertExample();
		//fetchAllExample();
	}
	
	public static void fetchAllExample() {
		List<Employee> employees = new ArrayList<Employee>();
		SessionFactory sf = HibernateUtil.getSessionFactory();
		try (Session session = sf.openSession()) {
			Transaction tx = session.beginTransaction();
			Query query = session.createQuery("from SalesPerson e");
			employees = query.getResultList();
			tx.commit();
			
		}
		System.out.println(employees.size());
	}
	
	public static void fetchExample1() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Employee emp = session.get(Employee.class, 3);
		System.out.println(emp.getClass().getName());
		tx.commit();
	}
	
	public static void insertExample() {
		Employee emp1 = new Employee(1, "Jack", 1000.0);
		Employee emp2 = new SalesPerson(2, "Jackie", 2000.0, 50000, 5);
		Employee emp3 = new WageEmployee(3, "Jessica", 3000.0, 50, 20);
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		
		tx.commit();
	}
	
	
	

}

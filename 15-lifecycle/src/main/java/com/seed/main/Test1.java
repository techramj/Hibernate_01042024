package com.seed.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seed.entities.Employee;
import com.seed.util.HibernateUtil;

public class Test1 {
	
	private static SessionFactory sf = HibernateUtil.getSessionFactory();
	
	public static void example1() {
		Employee emp = new Employee("Sam", 4000); //transient state
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(emp); //persistent state
		//session.saveOrUpdate(emp);
		//session.update(emp);
		//session.persist(emp);
		emp.setSalary(5000);
		emp.setName("Jack");
		tx.commit();
		
	
		//session is closed => no
	}
	
	public static void example2() {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Employee emp = session.get(Employee.class, 100); //emp is in persistent state
		
		session.detach(emp); //emp is in detached state
		//session.evict(emp);
		//session.clear();
		
		emp.setSalary(45000);
		session.update(emp);  //emp is in persistent state
		
		emp.setName("xyz123");
		tx.commit();
	}
	
	public static void example3() {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		
		tx.commit();
	}
	
	public static void main(String[] args) {
		example2();
	}
	
	
	
	

}

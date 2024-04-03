package com.seed.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.seed.entities.Employee;

public class Test1 {
	
	public static void saveEmployee(Employee emp, SessionFactory sf) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(emp);
		
		
		transaction.commit();
		session.close();	
	}
	
	
	
	public static void saveEmployee1(Employee emp, SessionFactory sf) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = sf.openSession();
			transaction = session.beginTransaction();
			session.save(emp);
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			if( transaction!= null) {
				transaction.rollback();
			}
		}finally {
			session.close();	
		}
	}
	
	public static void saveEmployee2(Employee emp, SessionFactory sf) {
		try(Session session = sf.openSession()){
			Transaction transaction = session.beginTransaction();
			session.save(emp);
		    transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("jack");
		e1.setSalary(3000.0);
		
		saveEmployee(e1,sf);
		
	}

}

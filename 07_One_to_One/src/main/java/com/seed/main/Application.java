package com.seed.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seed.entities.Employee;
import com.seed.entities.Passport;
import com.seed.util.HibernateUtil;

public class Application {
	
	public static void main(String[] args) {
		
		//addExample();
		fetchExample();
	}
	

	public static void addExample() {
		Employee emp = new Employee("Sam", 4000.0);
		Passport p1 = new Passport("AoMP111123", new Date(2034, 10, 12));
		emp.setPassport(p1);
		
		
		//addPassport(p1);
		addEmployee(emp);
	}
	
	public static void fetchExample() {
		Employee emp = getEmployee(1);
		displayEmployee(emp);
		
		//Passport passport = getPassport(1);
		//System.out.println(passport);
	}
	
	
	public static void addEmployee(Employee emp) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(emp);
		tx.commit();
	}
	
	public static void displayEmployee(Employee emp) {
		System.out.println("Emp details:");
		System.out.println("Name: "+emp.getName());
		System.out.println("Salary: "+emp.getSalary());
		System.out.println("Passport: "+emp.getPassport().getPassportNumber());
		System.out.println("_________________________________________\n");
	}
	
	
	
	public static void addPassport(Passport passport) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(passport);
		tx.commit();
	}
	
	public static Employee getEmployee(int id) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			Employee emp = session.get(Employee.class, id);
			tx.commit();
			return emp;
		
	}
	
	public static Passport getPassport(int passportId) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		try (Session session = sf.openSession()) {
			Transaction tx = session.beginTransaction();
			Passport passport = session.get(Passport.class, passportId);
			tx.commit();
			return passport;
		}
	}

}

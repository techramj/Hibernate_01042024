package com.seed.main;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seed.entities.Employee;
import com.seed.entities.Project;
import com.seed.util.HibernateUtil;

public class ApplicationTest {
	
	public static void main(String[] args) {
		//insertExample();
		fetchExample();
	}
	
	public static void fetchExample() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Employee emp = session.get(Employee.class, 102);
		tx.commit();
		System.out.println(emp);
	}
	
	public static void  insertExample() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Employee emp1 = new Employee("Jack", 3000.0);
		Employee emp2 = new Employee("Sam", 4000.0);
		Employee emp3 = new Employee("Jessica", 5000.0);
		
		Project p1 =  new Project("Friend zone");
		Project p2 = new Project("Generic Medi Care");
		
		emp1.addProject(p1);
		emp2.addProject(p2);
		emp3.addProject(p1);
		emp3.addProject(p2);
		
		addEmployees(Arrays.asList(emp1, emp2, emp3));
		
	}
	
	public static void addEmployees(List<Employee> employees) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		for(Employee emp:employees) {
			session.save(emp);
		}
		tx.commit();
	}
	
	public static void addEmployee(Employee emp) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(emp);
		tx.commit();
	}
	
	
	public static  void addProject(Project project) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(project);
		tx.commit();
	}
	

}

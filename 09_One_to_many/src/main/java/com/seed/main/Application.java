package com.seed.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seed.entities.Department;
import com.seed.entities.Employee;
import com.seed.util.HibernateUtil;

public class Application {

	public static void main(String[] args) {
		//insertExample();
		fetchExample();

	}

	public static void insertExample() {
		Employee emp1 = new Employee("Sam", 4000.0);
		Employee emp2 = new Employee("Jack", 9000.0);
		Employee emp3 = new Employee("Jessica", 5000.0);
		
		Department it = new Department();
		it.setName("IT");
		
		Department hr = new Department();
		hr.setName("hr");

		//addDept(it);
		//addDept(hr);
		
		emp1.setDepartment(it);
		emp2.setDepartment(it);
		emp3.setDepartment(hr);
		
		addEmployee(emp1);
		addEmployee(emp2);
		addEmployee(emp3);

	}

	public static void fetchExample() {
		Employee emp = getEmployee(1);
		displayEmployee(emp);
	}

	public static void displayEmployee(Employee emp) {
		System.out.println("Emp details:");
		System.out.println("Name: " + emp.getName());
		System.out.println("Salary: " + emp.getSalary());
		//System.out.println("department name: " + emp.getDepartment().getName());
		System.out.println("_________________________________________\n");
	}

	public static void addEmployee(Employee emp) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(emp);
		tx.commit();
	}

	public static void addDept(Department dept) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(dept);
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

	public static Department getPassport(int did) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		try (Session session = sf.openSession()) {
			Transaction tx = session.beginTransaction();
			Department dept = session.get(Department.class, did);
			tx.commit();
			return dept;
		}
	}

}

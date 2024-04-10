package com.seed.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.seed.entities.Address;
import com.seed.entities.Employee;
import com.seed.util.HibernateUtil;

public class Test {
	
	public static Employee getSampleEmployee() {
		Employee emp = new Employee();
		emp.setName("Jack");
		emp.setSalary(12000.0);
		
		List<String> projects = new ArrayList<String>();
		projects.add("EMS");
		projects.add("Connect Friend");
		
		Set<String> skills  = new HashSet<String>();
		skills.add("Core Java");
		skills.add("WCD");
		skills.add("Hibernate");
		skills.add("SQL");
		
		emp.setProjects(projects);
		emp.setSkills(skills);
		
		return emp;
	}
	
	
	public static Employee getSampleEmployee2() {
		Employee emp = new Employee();
		emp.setName("Jackson");
		emp.setSalary(2000.0);
		
		List<String> projects = new ArrayList<String>();
		projects.add("Citi Corp");
		projects.add("Connect Friend");
		
		Set<String> skills  = new HashSet<String>();
		skills.add("Core Java");
		skills.add("Spring");
		skills.add("Hibernate");
		skills.add("SQL");
		
		emp.setProjects(projects);
		emp.setSkills(skills);
		
		
		Address fatherAdd = new Address("Pune", "12345", "father");
		Address uncleAddress = new Address("Mumbai", "22345", "uncle");
		Address mamaAddress = new Address("Nagpur", "332223", "Mama");
		
		List<Address> addressList = new ArrayList<Address>();
		addressList.add(fatherAdd);
		addressList.add(uncleAddress);
		addressList.add(mamaAddress);
		
		emp.setParentAddress(addressList);
		
		return emp;
	}
	
	
	public static void insertExample1() {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			Transaction tx = session.beginTransaction();
			session.save( getSampleEmployee());
			tx.commit();
		}
	}
	
	
	public static void insertExample2() {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			Transaction tx = session.beginTransaction();
			session.save( getSampleEmployee2());
			tx.commit();
		}
	}
	public static void main(String[] args) {
		//insertExample1();
		insertExample2();
	}

}

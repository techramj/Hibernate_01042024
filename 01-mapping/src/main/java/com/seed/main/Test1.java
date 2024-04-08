package com.seed.main;

import java.lang.reflect.Field;
import java.util.Date;

import com.seed.dao.EmployeeDao;
import com.seed.dao.impl.EmployeeDaoImpl;
import com.seed.entities.Employee;
import com.seed.util.HibernateUtil;

public class Test1 {
	private static EmployeeDao dao = new EmployeeDaoImpl();
	
	public static void getPropertiesInfo(Class clazz) {
		Field[] fields = clazz.getDeclaredFields();
		for(Field f :fields) {
			System.out.println(f.getName());
		}
	}
	
	public static void addEmployeExample() {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Jack");
		emp.setSalary(1000.0);
		emp.setDateOfBirth(new Date(2000, 4,5));
		emp.setDateOfJoining(new Date(2024, 4,5));
		emp.setEmail("jack@test.com");
		EmployeeDao dao = new EmployeeDaoImpl();
		dao.save(emp);
	}
	
	public static void updateEmployeExample() {
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("Jack");
		emp.setSalary(7000.0);
		emp.setDateOfBirth(new Date(2000, 4,5));
		emp.setDateOfJoining(new Date(2024, 4,5));
		emp.setEmail("jack1@gmail.com");
		EmployeeDao dao = new EmployeeDaoImpl();
		dao.update(emp);
	}
	
	public static void fetchEmpByIdExample() {
		Employee emp = dao.findById(2);
		System.out.println(emp.getId()+"   "+emp.getName()+"  "+emp.getSalary());
		
	}
	
	
	public static void main(String[] args) {
		//addEmployeExample();
		//updateEmployeExample();
		fetchEmpByIdExample();
		
	}

}

package com.seed.main;

import java.sql.SQLException;

import com.seed.dao.EmpDao;
import com.seed.dao.EmpDaoImpl;
import com.seed.entity.Address;
import com.seed.entity.Department;
import com.seed.entity.Employee;

public class Test1 {
	
	public static void example1() {
		//save emp object1
		Department dept = new Department();
		dept.setDid(10);
		dept.setDeptName("HR");
		
		Address add = new Address();
		add.setAddressId(1001);
		add.setLine1("flat no 4,house no 4");
		add.setLine2("SB ROAD");
		add.setCity("pune");
		add.setPincode(123456);
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Jack");
		emp.setSalary(5000);
		emp.setAddress(add);
		emp.setDepartment(dept);
		
		EmpDao dao = new EmpDaoImpl();
		try {
			dao.save(emp);
			System.out.println("employee object added successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void example2() {
		EmpDao dao = new EmpDaoImpl();
		try {
			Employee emp = dao.findById(1);
			System.out.println(emp.getId()+"  "+emp.getName()+"  "+emp.getSalary());
			System.out.println("Address: "+emp.getAddress().getCity());
			System.out.println("Dept: "+emp.getDepartment().getDeptName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		example2();
	}

}

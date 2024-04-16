package com.seed.test;

import java.util.List;

import com.seed.dao.EmployeeDao;
import com.seed.dao.impl.EmployeeDaoImpl;
import com.seed.entities.Employee;

public class Test1 {
	
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		//List<Employee> list1 = dao.findAllUsingNativeQuery1();
		//display(list1);
		//List<Object[]> list1 = dao.findAllUsingNativeQuery();
		//display1(list1);
		
		Employee emp = dao.findById(1);
		System.out.println(emp);
		//System.out.println(emp.getId()+"  "+emp.getName()+"   "+emp.getNetSalary());
		
		Employee emp1 = dao.findByIdUsingLoad(1);
		System.out.println(emp1);
		//System.out.println(emp1.getId()+"  "+emp1.getName()+"   "+emp1.getNetSalary());
	}
	
	
	
	public static void display(List<Employee> list) {
		if(list.size() ==0) {
			System.out.println("no employee found....");
			return;
		}
		for(Employee e:list) {
			System.out.println("Id:"+e.getId()+"\t\tName: " +e.getName()+"\t\tSalary: "+e.getNetSalary());
		}
	}
	
	public static void display1(List<Object[]> list) {
		if(list.size() ==0) {
			System.out.println("no employee found....");
			return;
		}
		for(Object[] ar : list) {
			System.out.println("Id:"+ar[0]+"\t\tName: " +ar[1]+"\t\tSalary: "+ar[2]);
		}
	}

}

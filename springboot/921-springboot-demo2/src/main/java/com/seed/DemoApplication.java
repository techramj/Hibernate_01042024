package com.seed;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.seed.entity.Employee;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("create the object of emp");
		/*Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Jack");
		emp.setSalary(4000);
		*/
		Employee emp = Employee.builder().id(1).name("jack").salary(4000).build();
	}

}

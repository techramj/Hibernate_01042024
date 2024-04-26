package com.seed.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.seed.model.Employee;

@Configuration
public class Config {
      
	@Bean
	public Employee emp() {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Jessica");
		emp.setSalary(5000);
		return emp;

	}
}

package com.seed;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.seed.model.Car;
import com.seed.model.Employee;
import com.seed.model.Engine;

@Configuration
public class Config {
	
	@Scope("prototype")
	@Bean
	public Employee emp() {
		Employee e1= new Employee();
		e1.setSalary(1);
		e1.setName("jack");
		e1.setSalary(4000);
		return e1;
	}
	
	@Scope("prototype")
	@Bean
	public Engine engine1() {
		return new Engine("Four Stroke 1400CC", "EV");
	}
	
	
	@Scope("prototype")
	@Bean
	public Car car() {
		Car c = new Car();
		c.setColor("Black");
		c.setName("Tata Nexon");
		c.setEngine(engine1());
		
		return c;
	}

}

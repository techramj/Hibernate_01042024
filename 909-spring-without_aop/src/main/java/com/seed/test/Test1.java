package com.seed.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seed.service.LoanService;

public class Test1 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		LoanService loanService = context.getBean("loanService", LoanService.class);
		System.out.println("class Name: "+ loanService.getClass().getName());
		loanService.issueLoan("Cust-01");

	}

}

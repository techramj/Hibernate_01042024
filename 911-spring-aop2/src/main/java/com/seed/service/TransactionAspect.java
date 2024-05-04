package com.seed.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransactionAspect {
	
	@Around("execution(* LoanService.payDue(..))")
	public void around(ProceedingJoinPoint jp) {
		System.out.println("begin transaction");
		try {
			jp.proceed();
			System.out.println("commit");
		}catch(Throwable e) {
			System.out.println("rollback");
		}
	}

}

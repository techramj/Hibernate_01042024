package com.seed.service;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	
	//@Before("execution(* LoanService.*(..))")
	public void logBefore(JoinPoint jp) {
		System.out.println("Entered: "+jp.getSignature().getDeclaringTypeName()
				+"."+jp.getSignature().getName()+" at " + new Date());
	}
	
	@After("execution(* LoanService.*(..))")
	public void logAfter(JoinPoint jp) {
		System.out.println("Exit: @After"+jp.getSignature().getDeclaringTypeName()
				+"."+jp.getSignature().getName()+" at " + new Date());
	}
	
	
	@AfterReturning("execution(* LoanService.*(..))")
	public void afterReturning(JoinPoint jp) {
		System.out.println("@AfterReturning: "+jp.getSignature().getDeclaringTypeName()
				+"."+jp.getSignature().getName()+" at " + new Date());
	}
	
	@AfterThrowing("execution(* LoanService.*(..))")
	public void afterThrowing(JoinPoint jp) {
		System.out.println("@AfterThrowing: "+jp.getSignature().getDeclaringTypeName()
				+"."+jp.getSignature().getName()+" at " + new Date());
	}


}

package com.seed.service;

import java.time.LocalDateTime;
import java.util.Date;

public class LoanService {

	public void issueLoan(String customerId) {
		// logging
		System.out.println("Entered: LoanService.issueLoan at " + new Date());
		System.out.println("Loan issued to " + customerId);

		// logging
		System.out.println("Exit: LoanService.issueLoan at " + LocalDateTime.now());
	}

	public void payDue(String customerId) {
		// logging
		System.out.println("Entered: LoanService.payDue at " + new Date());

		// transaction logic

		System.out.println("begin transaction");
		try {
			System.out.println("Pending due is cleared for customer: " + customerId);
			System.out.println("delete the customer entry from loanAccount");
			System.out.println("commit");
		} catch (Exception e) {
			System.out.println("rollback");
		}

		// logging
		System.out.println("Exit: LoanService.payDue at " + LocalDateTime.now());
	}

}
/*
 * public class LoanService {
 * 
 * public void issueLoan(String customerId) { //logging
 * System.out.println("Loan issued to "+customerId); }
 * 
 * public void payDue(String customerId) {
 * 
 * System.out.println("Pending due is cleared for customer: "+customerId);
 * System.out.println("delete the customer entry from loanAccount");
 * 
 * }
 * 
 * }
 */
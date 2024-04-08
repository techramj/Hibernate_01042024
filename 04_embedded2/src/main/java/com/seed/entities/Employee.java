package com.seed.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "emp_03")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_03_seq")
	@SequenceGenerator(name = "emp_03_seq", sequenceName = "seq_emp_03", initialValue = 100, allocationSize = 1)
	private Integer id;
	private String name;
	private Double salary;

	@Embedded
	@AttributeOverrides(value = {
			@AttributeOverride(name="city" , column = @Column(name="billing_city")),
			@AttributeOverride(name="pincode" , column = @Column(name="billing_pincode")),
	})
	private Address billingAddress;

	@AttributeOverrides(value = {
			@AttributeOverride(name="city" , column = @Column(name="mailing_city")),
			@AttributeOverride(name="pincode" , column = @Column(name="mailing_pincode")),
	})
	@Embedded
	private Address mailingAddress;

	@AttributeOverrides(value = {
			@AttributeOverride(name="city" , column = @Column(name="perm_add_city")),
			@AttributeOverride(name="pincode" , column = @Column(name="perm_add_pincode")),
	})
	@Embedded
	private Address permanentAddress;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Address getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(Address mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

}

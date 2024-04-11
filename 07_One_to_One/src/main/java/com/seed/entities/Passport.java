package com.seed.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "passport_05")
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "passport_id_gen")
	@SequenceGenerator(name = "passport_id_gen", sequenceName = "seq_passport_05_id")
	@Column(name = "passport_id")
	private int passportId;

	@Column(name = "passport_number", length = 13, nullable = false)
	private String passportNumber;

	@Column(name = "expiry_date")
	private Date expiryDate;

	public Passport() {
		// TODO Auto-generated constructor stub
	}

	public Passport(String passportNumber, Date expiryDate) {
		this.passportNumber = passportNumber;
		this.expiryDate = expiryDate;
	}

	public int getPassportId() {
		return passportId;
	}

	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", passportNumber=" + passportNumber + ", expiryDate="
				+ expiryDate + "]";
	}

}

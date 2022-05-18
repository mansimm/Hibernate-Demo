package com.practice.hbm;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@Column(name="customer_id")
	private Integer customerId;
	
	@Column(name="customer_name")
	private String customerName;
	
	@Column(name="date_of_birth")
	private Calendar dateOfBirth;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phone_no")
	private Long phoneNo;
	
	public Customer() {};

	public Customer(Integer customerId, String customerName, Calendar dateOfBirth, String address, Long phoneNo) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phoneNo = phoneNo;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	

}

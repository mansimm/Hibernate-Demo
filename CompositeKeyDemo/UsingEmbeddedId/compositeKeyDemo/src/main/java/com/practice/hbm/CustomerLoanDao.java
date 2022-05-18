package com.practice.hbm;

public interface CustomerLoanDao {

	public CustomerLoanPk saveCustomerLoan(CustomerLoan cusomerLoan);
	public CustomerLoan getCustomerLoan(Integer cid, Integer lid);
}

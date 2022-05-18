package com.practice.hbm;

public class Demo {

	public static void main(String[] args) {
		
		CustomerLoanDaoImpl customerLoanDaoImpl = new CustomerLoanDaoImpl();
		
		System.out.println("Save Customer Loan :");
		CustomerLoan customerLoan = new CustomerLoan( 101, 1, 500000.0,  300000.0, 2);
		CustomerLoanPk customerLoanPk = customerLoanDaoImpl.saveCustomerLoan(customerLoan);
		System.out.println("Customer Loan is saved as follows ");
		System.out.println(customerLoanPk);
		
		System.out.println("Get Customer Loan withe kay(101, 1) :");
		CustomerLoan customerLoan2 = customerLoanDaoImpl.getCustomerLoan(101, 1);
		if(customerLoan2==null)
		{
			System.out.println("Customer Loan not found !! ");
		}
		else
		{
			System.out.println("Customer Loan found as follow ");
			System.out.println(customerLoan2);
		}
		
	}

}

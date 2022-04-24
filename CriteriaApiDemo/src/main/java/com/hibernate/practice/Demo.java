package com.hibernate.practice;

import java.util.List;

import org.apache.log4j.Logger;
 
public class Demo {
	static Logger logger = Logger.getLogger(Demo.class);
	public static void main(String[] args) {
		getCountOfDistinctAccountTypes();
		getprojectionsAggregate();
		getCustomerNameDetails();
		getCustomerNameAndPhoneNumberDetailsInAlphabeticalOrder();
	}
	public static void getCustomerNameDetails() {
		List<Customer> details = null;
		CustomerAccountDAOImpl dao = new CustomerAccountDAOImpl();
		try {
			details = dao.getCustomerName();
			
			if(details != null){
				System.out.println("Customer Details");
				System.out.println("=================");
				for (Customer customer : details) {
					
					System.out.println("Customer Name\t: "+customer.getCustomerName());
				}
			}
				else{
					System.out.println("CUSTOMER_NOT_FOUND");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void getCustomerNameAndPhoneNumberDetailsInAlphabeticalOrder() {
		List<Customer> details = null;
		CustomerAccountDAOImpl dao = new CustomerAccountDAOImpl();
		try {
			details = dao.getCustomerNameAndPhoneNumberDetailsInAlphabeticalOrder();
			if(details != null){
				System.out.println("Customer Details");
				System.out.println("=================");
				System.out.println("Customer Name\t\tContact Number");
				System.out.println("--------------------------------------");
				for (Customer customer : details) {
					System.out.println(customer.getCustomerName()+"\t\t"+customer.getPhoneNo());
				}
			}
				else{
					System.out.println("CUSTOMER_NOT_FOUND");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
 
	public static void getCountOfDistinctAccountTypes() {
		List<Object> details = null;
		CustomerAccountDAOImpl dao = new CustomerAccountDAOImpl();
		try {
			details = dao.getCountOfDistinctAccountTypes();
			if (details != null) {
				for (Object obj : details) {
					System.out.println("No Of Account Types \t: " + obj);
					System.out.println();
				}
			} else {
				System.out.println("NO_ACCOUNT_TYPES_FOUND");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
 
	public static void getprojectionsAggregate() {
		List<Object[]> details = null;
		CustomerAccountDAOImpl dao = new CustomerAccountDAOImpl();
		try {
			details = dao.projectionsAggregate();
			if (details != null) {
				Object[] obj = details.get(0);
				System.out.println("The maximum of balance:	" + obj[0]);
				System.out.println("The minimum of balance:	" + obj[1]);
				System.out.println("The average of balance:	" + obj[2]);
				System.out.println("The sum of balance:	" + obj[3]);
				System.out.println("The count of accountNo: " + obj[4]);
				System.out.println("The row count is:	" + obj[5]);
				System.out.println("Count of distinct customerId: " + obj[6]);
			} else {
				System.out.println("ACCOUNT_NOT_FOUND");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
}

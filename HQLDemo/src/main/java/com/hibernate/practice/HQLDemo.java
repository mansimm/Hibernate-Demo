package com.hibernate.practice;

import java.util.Scanner;

public class HQLDemo {

	public static void main(String[] args)
	{
		HQLDemo hqlDemo = new HQLDemo();
		hqlDemo.get();
		//hqlDemo.update();
		//hqlDemo.delete();
	}
	public void delete()
	{
		Scanner sc = new Scanner(System.in);
		CustomerDao customerDAO = new CustomerDao();
		System.out.println("\n  * Delete Customer *");
		System.out.println("Enter customer id of customer to delete :");
		int id = sc.nextInt();
		customerDAO.deleteCustomer(id);
	}
	public void update()
	{
		Scanner sc = new Scanner(System.in);
		CustomerDao customerDAO = new CustomerDao();
		System.out.println("\n  * Update Customer *");
		System.out.println("Enter customer id of customer to update :");
		int y1 = sc.nextInt();
		System.out.println("Enter new customer name :");
		String newName = sc.next();
		customerDAO.updateCustomerName(y1, newName);
	}

	
	public void get()
	{
		Scanner sc = new Scanner(System.in);
		CustomerDao customerDAO = new CustomerDao();
		System.out.println("\n  * Find Customer *");
		System.out.println("Enter customer id to find :");
		int y = sc.nextInt();
		Customer c1 = customerDAO.getCustomer(y);
		if(c1==null)
		{
			System.out.println("Customer not found with id "+y+" !");
		}
		else
		{
			System.out.println("Customer found as follows :");
			System.out.println(c1);
		}
	}
}

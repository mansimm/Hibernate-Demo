package com.hibernate.practice;

import java.util.Scanner;

public class HibernateDemo {
	
	
	public static void main(String[] args)
	{
		HibernateDemo hibernateDemo = new HibernateDemo();
		hibernateDemo.insert();
		//hibernateDemo.get();
		//hibernateDemo.update();
		//hibernateDemo.delete();
	}
	public void delete()
	{
		Scanner sc = new Scanner(System.in);
		CustomerDAO customerDAO = new CustomerDAO();
		System.out.println("\n  * Delete Customer *");
		System.out.println("Enter customer id of customer to delete :");
		int id = sc.nextInt();
		customerDAO.deleteCustomer(id);
	}
	public void update()
	{
		Scanner sc = new Scanner(System.in);
		CustomerDAO customerDAO = new CustomerDAO();
		System.out.println("\n  * Update Customer *");
		System.out.println("Enter customer id of customer to update :");
		int y1 = sc.nextInt();
		System.out.println("Enter new customer name :");
		String newName = sc.next();
		customerDAO.updateCustomerName(y1, newName);
	}
	public void insert()
	{
		Scanner sc = new Scanner(System.in);
		CustomerDAO customerDAO = new CustomerDAO();		
		System.out.println("\n  * Create Customer *");
		System.out.println("Enter Cusomer details - ");
		System.out.println("Customer id : ");
		int id = sc.nextInt();//sc.hasNext();
		System.out.println("Customer name : ");
		String name = sc.next();
		System.out.println(id+"  "+name);
		
		Customer c = new Customer(id,name);
		int x = customerDAO.addCustomer(c);
		System.out.println("Customer added");
	}
	
	public void get()
	{
		Scanner sc = new Scanner(System.in);
		CustomerDAO customerDAO = new CustomerDAO();
		System.out.println("\n  * Find Customer *");
		System.out.println("Enter customer id to find :");
		int y = sc.nextInt();
		Customer c1 = customerDAO.getCustomer(y);
		if(c1==null)
		{
			System.out.println("Customer not found with id "+y);
		}
		else
		{
			System.out.println("Customer found as follows :");
			System.out.println(c1);
		}
	}
}


package com.hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerDAO implements ICustomer{

	SessionFactory sessionFactory;
	
	public Integer addCustomer(Customer customer)  {
		
		sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction =  session.beginTransaction();
		Integer id = (Integer) session.save(customer);
		transaction.commit();
		session.close();
		return id;
	}

	public Customer getCustomer(Integer id) {
		sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = session.find(Customer.class, id);
		transaction.commit();
		session.close();
		return customer;
	}

	public void updateCustomerName(Integer id, String newName) {
		sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = session.find(Customer.class, id);
		if(customer==null)
		{
			System.out.println("Customer not found...");
		}
		else
		{
			customer.setCustomerName(newName);
			System.out.println("Customer name is updated to "+newName);
		}
		transaction.commit();
		session.close();
	}

	public void deleteCustomer(Integer id) {
		sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = session.find(Customer.class, id);
		if(customer==null)
		{
			System.out.println("Customer not found...");
		}
		else
		{
			session.delete(customer);
			System.out.println("Customer deleted !");
		}
		transaction.commit();
		session.close();
	}

}

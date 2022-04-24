package com.hibernate.practice;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerDao implements ICustomer {
	
	SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

	public Customer getCustomer(Integer id) {
		Session session =  sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		//:customerId is named parameter
		Query query = session.createQuery("from Customer c where c.customerId= :customerId");
		query.setParameter("customerId", id);
		List<Customer> list = query.list();
		Customer customer;
		if(list.size()==0)
		{
			customer = null;
		}
		else
		{
			customer =  list.get(0);
		}
		tx.commit();
		session.close();
		return customer;
	}

	public void updateCustomerName(Integer id, String newName) {
		Session session =  sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		//:customerId and :customerName is named parameter
		Query query = session.createQuery("update Customer c set c.customerName = :customerName where c.customerId=:customerId");
		query.setParameter("customerName", newName);
		query.setParameter("customerId", id);
		int x = query.executeUpdate();
		if(x==0||x==1)
		{
			System.out.println(x+" row updated...");
		}
		else
		{
			System.out.println(x+" rows updated...");
		}
		tx.commit();
		session.close();
	}

	public void deleteCustomer(Integer id) {
		Session session =  sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		//:customerId and :customerName is named parameter
		Query query = session.createQuery("delete from Customer c where c.customerId=:customerId");
		query.setParameter("customerId", id);
		int x = query.executeUpdate();
		if(x==0||x==1)
		{
			System.out.println(x+" row deleted...");
		}
		else
		{
			System.out.println(x+" rows deleted...");
		}
		tx.commit();
		session.close();
		
	}

}

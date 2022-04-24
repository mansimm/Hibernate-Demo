package com.hibernate.practice;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class CustomerAccountDAOImpl implements CustomerAccountDAO{

	SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
	
	public List<Object> getCountOfDistinctAccountTypes() throws Exception {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Account.class); 
		criteria.setProjection(Projections.countDistinct("accountType"));
		List<Object>  ans = criteria.list();
		return ans;
	}

	public List<Object[]> projectionsAggregate() throws Exception {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Account.class); 
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.max("balance"));
		projectionList.add(Projections.min("balance"));
		projectionList.add(Projections.avg("balance"));
		projectionList.add(Projections.sum("balance"));
		projectionList.add(Projections.count("accountNo"));
		projectionList.add(Projections.rowCount());
		projectionList.add(Projections.countDistinct("customer.customerId"));

		criteria.setProjection(projectionList);
		List<Object[]> ans = criteria.list();
		return ans;
	}

	public List<Customer> getCustomerName() throws Exception {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		criteria.setProjection(Projections.property("customerName"));
		List<String> names = criteria.list();
		
		List<Customer> custList = new ArrayList<Customer>();
		for(String name:names)
		{
			Customer c = new Customer();
			c.setCustomerName(name);
			custList.add(c);
		}
		return custList;
	}

	public List<Customer> getCustomerNameAndPhoneNumberDetailsInAlphabeticalOrder() throws Exception {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.property("customerName"));
		projectionList.add(Projections.property("phoneNo"));
		criteria.setProjection(projectionList);
		criteria.addOrder(Order.asc("customerName"));
		List<Object[]> ans = criteria.list();
		
		List<Customer> custList = new ArrayList();
		for(Object[] obj : ans)
		{
			Customer c = new Customer();
			c.setCustomerName(obj[0].toString());
			c.setPhoneNo((Long)obj[1]);
			custList.add(c);
		}
		return custList;
	}

}

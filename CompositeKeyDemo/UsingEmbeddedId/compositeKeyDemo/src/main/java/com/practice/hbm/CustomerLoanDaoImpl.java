package com.practice.hbm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerLoanDaoImpl implements CustomerLoanDao{

	HibernateUtils hibernateUtils= new HibernateUtils();
	SessionFactory sessionFactory = hibernateUtils.getSessionfactory();
	
	public CustomerLoanPk saveCustomerLoan(CustomerLoan cusomerLoan) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		CustomerLoanPk cusomerLoanPk = (CustomerLoanPk) session.save(cusomerLoan);
		transaction.commit();
		return cusomerLoanPk;
	}

	public CustomerLoan getCustomerLoan(Integer cid, Integer lid) {
		CustomerLoanPk cusomerLoanPk = new CustomerLoanPk();
		cusomerLoanPk.setCustomerId(cid);
		cusomerLoanPk.setLoanId(lid);
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		CustomerLoan customerLoan = session.get(CustomerLoan.class, cusomerLoanPk);
		transaction.commit();
		return customerLoan;
	}

	

}

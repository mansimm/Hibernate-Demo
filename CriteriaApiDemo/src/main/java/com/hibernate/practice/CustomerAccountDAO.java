package com.hibernate.practice;

import java.util.List;

public interface CustomerAccountDAO {
	public List<Object> getCountOfDistinctAccountTypes() throws Exception;
	public List<Object[]> projectionsAggregate() throws Exception;
	public List<Customer> getCustomerName() throws Exception;
	public List<Customer> getCustomerNameAndPhoneNumberDetailsInAlphabeticalOrder() throws Exception;

}

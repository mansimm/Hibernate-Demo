package com.hibernate.practice;



public interface ICustomer {

	public Integer addCustomer(Customer customer);
	public Customer getCustomer(Integer id);
	public void updateCustomerName(Integer id, String newName);
	public void deleteCustomer(Integer id);

}

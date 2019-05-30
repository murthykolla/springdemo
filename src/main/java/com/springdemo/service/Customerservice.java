package com.springdemo.service;

import java.util.List;

import com.springdemo.bean.Customer;

public interface Customerservice {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	
}
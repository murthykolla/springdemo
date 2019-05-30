package com.springdemo.dao;

import java.util.List;

import com.springdemo.bean.Customer;
import com.springdemo.controller.CustomerController;

public interface Customerdao{

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	
}
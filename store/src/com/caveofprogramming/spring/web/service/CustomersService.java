package com.caveofprogramming.spring.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caveofprogramming.spring.web.dao.Customer;
import com.caveofprogramming.spring.web.dao.CustomerDAO;

@Service("customersService")
public class CustomersService {
	private CustomerDAO customerDAO;

	@Autowired
	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	public void create(Customer customer) {
		customerDAO.create(customer);
	}

	public boolean exists(String username) {
	return customerDAO.exists(username);
	}

}

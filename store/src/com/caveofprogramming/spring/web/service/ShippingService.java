package com.caveofprogramming.spring.web.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caveofprogramming.spring.web.dao.Customer;
import com.caveofprogramming.spring.web.dao.ShippingDao;

@Service("shippingService")
public class ShippingService {
	@Autowired
	private ShippingDao shippingDao;

	
	@Autowired
	private SessionFactory sessionFactory;

	public Session session() {
		return sessionFactory.getCurrentSession();
	}

	public List<Customer> getCurrent() {
		return shippingDao.getAllShipping();

	}

	public void sendShipping(Customer customer) {
		session().saveOrUpdate(customer);
	}
	public Customer getCustomer(String username){
		System.out.println("debug excellent");
		return shippingDao.getUser(username);
	
	}
}

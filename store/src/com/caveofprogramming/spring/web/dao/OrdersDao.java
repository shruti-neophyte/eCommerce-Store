package com.caveofprogramming.spring.web.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository//translating hib exceptions to spring exception
//catching them all in spring dataccessexception
@Transactional

public class OrdersDao {
	@Autowired
	private SessionFactory sessionFactory;

	public Session session() {
		return sessionFactory.getCurrentSession();
	}

	@Transactional
	public void create(Orders orders) {
		session().save(orders);
	}

	@SuppressWarnings("unchecked")
	public List<Orders> getAllOrders() {

		return session().createQuery("from Order").getResultList();
	}
	
}

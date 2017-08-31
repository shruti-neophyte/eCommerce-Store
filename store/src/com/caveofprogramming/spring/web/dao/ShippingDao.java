package com.caveofprogramming.spring.web.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class ShippingDao {
	@Autowired
	private SessionFactory sessionFactory;

	public Session session() {
		return sessionFactory.getCurrentSession();
	}

	public void saveOrUpdate(Customer customer) {
System.out.println(customer);
		session().saveOrUpdate(customer);
	}

	@SuppressWarnings("unchecked")
	public List<Customer> getAllShipping() {

		return session().createQuery("from Customer").getResultList();
	}

	public Customer getUser(String username) {
		
		CriteriaBuilder builder = session().getCriteriaBuilder();
		CriteriaQuery<Customer> criteria = builder.createQuery(Customer.class);

		Root<Customer> root = criteria.from(Customer.class);
		criteria.select(root);
		criteria.where(builder.equal(root.get("username"), username));
		Customer customer = (Customer) session().createQuery(criteria).getResultList();

		return customer;
	}

}

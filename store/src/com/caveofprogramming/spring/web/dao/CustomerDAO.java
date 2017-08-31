package com.caveofprogramming.spring.web.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.sql.DataSource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@Component("customerDAO")
public class CustomerDAO {
	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	private SessionFactory sessionFactory;

	public Session session() {
		return sessionFactory.getCurrentSession();
	}

	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	public boolean create(Customer customer) {

		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(customer);

		return jdbc.update(
				"insert into customers (name, email, password,phone,username,streetname,aptno,city,country) values (:name, :email, :password,:phone,:username,:streetname,:aptno,:city,:country)",
				params) == 1;
	}

	/*
	 * public boolean exists(String username) { return jdbc.
	 * queryForObject("select count(*) from customers where username=:username",
	 * new MapSqlParameterSource("username", username), Integer.class) > 0; }
	 */
	public boolean exists(String username) {
		/*
		 * Criteria crit = session().createCriteria(Customer.class);
		 * crit.add(Restrictions.idEq(username)); Customer customer = (Customer)
		 * crit.uniqueResult(); return customer != null;
		 */
		CriteriaBuilder builder = session().getCriteriaBuilder();
		CriteriaQuery<Customer> criteria = builder.createQuery(Customer.class);

		Root<Customer> root = criteria.from(Customer.class);
		criteria.select(root);
		criteria.where(builder.equal(root.get("username"), username));

		// list will only contain 1 item if username exists, 0 if username
		// doesn't exist
		List<Customer> customer = session().createQuery(criteria).getResultList();

		return customer.size() != 0;
	}
}
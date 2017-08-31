package com.caveofprogramming.spring.web.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity // consider it as bean
@Table(name = "orders")
public class Orders {
	@Id // should always mark as a primary key which is in db
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	int oid;
	
	String username;
	
	@ManyToOne
	//@JoinColumn(name = "username")
	@JoinColumn(name = "username", referencedColumnName = "username", insertable = false, updatable = false)
	private Customer customer;


	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", username=" + username + ", customer=" + customer + "]";
	}


	public int getOid() {
		return oid;
	}


	public void setOid(int oid) {
		this.oid = oid;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	Orders() {

	}

	
}
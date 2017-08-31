package com.caveofprogramming.spring.web.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name = "orderitems")
public class OrderItems {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	int oitem_id;
	int oid;
	int id;
OrderItems(){
	
}
	 @ManyToOne
	 //@JoinColumn(name = "oid")
		@JoinColumn(name = "oid", referencedColumnName = "oid", insertable = false, updatable = false)

	private Orders orders;

	public int getOitem_id() {
	return oitem_id;
	}

	public void setOitem_id(int oitem_id) {
		this.oitem_id = oitem_id;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "OrderItems [oitem_id=" + oitem_id + ", oid=" + oid + ", id=" + id + ", orders=" + orders + "]";
	}
	
}

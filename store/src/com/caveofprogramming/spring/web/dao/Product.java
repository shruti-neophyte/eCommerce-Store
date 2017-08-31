package com.caveofprogramming.spring.web.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Product {
	
	int id;
	

	@Size(min = 5, message = "must be more than 4")
	@NotNull
	@Pattern(regexp = "\\D*", message = "digits not allowed")
	String productname;
	@NotBlank(message="required")
	@Pattern(regexp = "\\D*", message = "digits not allowed")
	@Size(min = 3, message = "must be more than 2")

	String category;

	@Digits(integer=5, fraction=2, message="the value must be less than five digits")
	Double price;
	@NotNull
	String description;
	@NotNull
	@Digits(fraction = 0, integer = 3, message = "whole number less than 1000")
	Integer units;
	
	@Pattern(regexp = "\\D*", message = "digits not allowed")
	@Size(min = 4, message = "must be more than 3")

	String manufacturer;

	public String getDescription() {
		return description;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getUnits() {
		return units;
	}

	public void setUnits(Integer units) {
		this.units = units;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getProductname() {
		return productname;
	}

	public Product(String productname, String category, double price) {

		this.productname = productname;
		this.category = category;
		this.price = price;

	}

	public Product() {

	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productname=" + productname + ", category=" + category + ", price=" + price + "]";
	}

}

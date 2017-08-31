package com.caveofprogramming.spring.web.dao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Repository;

import com.caveofprogramming.spring.web.validation.ValidEmail;

@Entity
@Table(name = "customers")
public class Customer implements Serializable{

	
	private static final long serialVersionUID = -4342058266946141079L;

	int cid;

	@Size(min = 3, message = "must be more than 2")
	@Pattern(regexp = "\\D*", message = "digits not allowed")

	String name;
	@ValidEmail(min = 6, message = "Type a valid email")

	String email;

	String password;
	@Pattern(regexp = "(^[+][0-9]{12})", message = "13 digits allowed,including +91")
	String phone;
	@Size(min = 4, message = "must be more than 3")
	@Id
	String username;
	@NotBlank(message = "cannot be empty")
	String streetname;
	@NotBlank(message = "cannot be empty")

	String aptno;
	@NotBlank(message = "cannot be empty")
	@Pattern(regexp = "\\D*", message = "digits not allowed")

	String city;
	@NotBlank(message = "cannot be empty")
	@Pattern(regexp = "\\D*", message = "digits not allowed")

	String country;

	public String getName() {
		return name;
	}

	public Customer() {

	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", password=" + password + ", phone=" + phone
				+ ", username=" + username + ", streetname=" + streetname + ", aptno=" + aptno + ", city=" + city
				+ ", country=" + country + "]";
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public String getAptno() {
		return aptno;
	}

	public void setAptno(String aptno) {
		this.aptno = aptno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}

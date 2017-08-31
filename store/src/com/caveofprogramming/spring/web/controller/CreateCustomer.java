package com.caveofprogramming.spring.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.caveofprogramming.spring.web.dao.Customer;
import com.caveofprogramming.spring.web.service.CustomersService;

@Controller
public class CreateCustomer {
	private CustomersService customersService;

	@Autowired
	public void setCustomersService(CustomersService customersService) {
		this.customersService = customersService;
	}

	@RequestMapping("/regcustomer")
	public String showCreateCustomer(Model model) {

		model.addAttribute("customer", new Customer());
		return "regcustomer";
	}

	@RequestMapping(value = "/docreatecustomer", method = RequestMethod.POST)
	public String showDoCreateCustomer(Model model, @Valid Customer customer, BindingResult result) {
		if (result.hasErrors()) {
			return "regcustomer";
		}
if(customersService.exists(customer.getUsername())){
	result.rejectValue("username","DuplicateKey.customer.username","This shitty       username already exists");
	return "regcustomer";

}
		customersService.create(customer);

		return "customercreated";
	}
}

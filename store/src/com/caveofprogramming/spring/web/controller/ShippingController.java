package com.caveofprogramming.spring.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.caveofprogramming.spring.web.dao.Customer;
import com.caveofprogramming.spring.web.service.ShippingService;

public class ShippingController {
	
	/*@RequestMapping("/shipping")
	public String showOffers(Model model) {

		List<Customer> ships = shippingService.getCurrent();

		model.addAttribute("ships", ships);

		return "showprod";
	}*/
}

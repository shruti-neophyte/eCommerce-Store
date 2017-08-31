package com.caveofprogramming.spring.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.caveofprogramming.spring.web.dao.Product;
import com.caveofprogramming.spring.web.service.ProductsService;

@Controller
public class ProductsController {
	private ProductsService productsService;

	@Autowired
	public void setOffersService(ProductsService productsService) {
		this.productsService = productsService;
	}

	@RequestMapping("/showprod")
	public String showOffers(Model model) {

		List<Product> products = productsService.getCurrent();

		model.addAttribute("products", products);

		return "showprod";
	}

	@RequestMapping("/pdtdetails")
	
	public String showPdtDetails(@RequestParam("id") int id, Model model) {
		Product products = productsService.getCurrentDetails(id);

		model.addAttribute("products", products);

		return "pdtdetails";
		
	}
	@RequestMapping("/ordernow")
	public String showOrderNow(@RequestParam("id") int id, Model model) {
		Product products = productsService.getCurrentDetails(id);

		model.addAttribute("products", products);

		return "ordernow";
	}
	
}

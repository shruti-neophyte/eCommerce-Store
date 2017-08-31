package com.caveofprogramming.spring.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.caveofprogramming.spring.web.dao.Product;
import com.caveofprogramming.spring.web.service.ProductsService;

@Controller
public class CreateProduct {
	
	private ProductsService productsService;

	@Autowired
	public void setProductsService(ProductsService productsService) {
		this.productsService = productsService;
	}
	
	@RequestMapping("/createproduct")
	public String showCreateProduct(Model model) {
		
		model.addAttribute("product",new Product());
		return "createproduct";
	}

	@RequestMapping(value="/docreateproduct", method = RequestMethod.POST)
	public String showDoCreateProduct(Model model,@Valid Product product,BindingResult result) {
		if (result.hasErrors()){
			return"createproduct";
		}
		
		productsService.create(product);

		
		
		return "productcreated";
	}
}

package com.caveofprogramming.spring.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caveofprogramming.spring.web.dao.Product;
import com.caveofprogramming.spring.web.dao.ProductDAO;

@Service("productsService")
public class ProductsService {
	private ProductDAO productDAO;

	@Autowired
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	public List<Product> getCurrent() {
		return productDAO.getProducts();
	}

	public Product getCurrentDetails(int id) {
		return productDAO.getProductsDetails(id);
	}

	public void create(Product product) {
		productDAO.create(product);
	}
}

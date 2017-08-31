package com.caveofprogramming.spring.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component("productDAO")
public class ProductDAO {
	private NamedParameterJdbcTemplate jdbc;
	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}
	public List<Product> getProducts() {

		return jdbc.query("select id,productname,category,price from products", new RowMapper<Product>() {

			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product product = new Product();
				product.setId(rs.getInt("id"));
				product.setProductname(rs.getString("productname"));
				product.setCategory(rs.getString("category"));
				product.setPrice(rs.getDouble("price"));
			

				return product;
			}

		});
	}

	public Product getProductsDetails(int id) {
MapSqlParameterSource params=new MapSqlParameterSource("id",id);
		return jdbc.queryForObject("select productname,category,price,manufacturer,description,units from products where id=:id", params,new RowMapper<Product>() {

			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product product = new Product();

				product.setProductname(rs.getString("productname"));
				product.setCategory(rs.getString("category"));
				product.setPrice(rs.getDouble("price"));
				product.setManufacturer(rs.getString("manufacturer"));
				product.setDescription(rs.getString("description"));
				product.setUnits(rs.getInt("units"));
				return product;
			}

		});
	}
	public boolean create(Product product) {

		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(product);
		
		return jdbc.update("insert into products (productname, category, description,price,units,manufacturer) values (:productname, :category, :description,:price,:units,:manufacturer)", params) == 1;
	}
}
























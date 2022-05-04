package com.zensar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.zensar.bean.Product;
import com.zensar.dao.ProductDAO;

@Service
public class ProductService {

	@Autowired
	ProductDAO dao;
	
	public Product addProduct(Product product) {
		return dao.save(product);
	}
	
	public Product findProduct(int id) {
		Optional<Product> opt = dao.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}
	public List<Product> getAllProducts(){
		return dao.findAll();
	}
	public Product upadateProduct(Product product) {
		return this.dao.save(product);
	}
	public boolean deleteProduct(int id) {
		this.dao.deleteById(id);
		return true;
	}
}

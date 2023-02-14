package com.ecommerce.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecommerce.products.controller.entity.Product;
import com.ecommerce.products.repository.ProductRepository;


@Service
public class ProductService {
	
	
	@Autowired
	private ProductRepository productRepository;
	
	
	
	public List<Product> list(){
		return productRepository.findAll();
	}
	
	public Product insert(@RequestBody Product product) {
		return productRepository.save(product);
		
	}
	

}

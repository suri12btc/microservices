package com.ecommerce.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.products.controller.entity.Product;
import com.ecommerce.products.service.ProductService;


@RestController
@RequestMapping("/product/")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	@GetMapping("rest")
	public String restTemplateExample() {
		//create object for RestTemplate
		RestTemplate rs=new RestTemplate();
	    //call or microservice you need store the store the result required ResponseEntity<datatype>
		ResponseEntity<String> result=rs.getForEntity("http://localhost:8081/categories/get", String.class);
		//here we are returning the result
		return ""+result;
	}
	
	
	@GetMapping("list")
	public String list(){
		RestTemplate rt=new RestTemplate();
		ResponseEntity<String> result=rt.getForEntity("http://localhost:8081/categories/get", String.class);
		System.out.println(result);
		//return productService.list();
		return ""+result;
	}
	@PostMapping("post")
	public Product insert(@RequestBody Product product) {
		return productService.insert(product);
	}

}

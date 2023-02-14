package com.ecommercepratice.categories.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommercepratice.categories.entity.Catetogries;
import com.ecommercepratice.categories.service.CategoriesServices;

@RestController
@RequestMapping("/categories/")
public class CategoriesController {
	
	@Autowired
	private CategoriesServices categoriesServices;
	@GetMapping("get")
	public List<Catetogries> list(){
		return categoriesServices.list();
	}
	@PostMapping("insert")
	public Catetogries insert(@RequestBody Catetogries catetogries) {
		return categoriesServices.insert(catetogries);
	}
}

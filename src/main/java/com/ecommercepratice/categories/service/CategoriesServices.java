package com.ecommercepratice.categories.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommercepratice.categories.entity.Catetogries;
import com.ecommercepratice.categories.repository.CategoriesRepository;

@Service
public class CategoriesServices {
	@Autowired
	private CategoriesRepository categoriesRepository;
	
	public List<Catetogries> list(){
		return categoriesRepository.findAll();
		
	}
	public Catetogries insert(Catetogries catetogries) {
		return categoriesRepository.save(catetogries);
	}
	
	

}

package com.ecommercepratice.categories.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommercepratice.categories.entity.Catetogries;

@Repository
public interface CategoriesRepository extends JpaRepository<Catetogries,Integer>{

}

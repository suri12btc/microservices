package com.ecommerce.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.products.controller.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{

}

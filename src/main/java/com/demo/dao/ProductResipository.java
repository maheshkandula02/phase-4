package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;


@Repository

public interface ProductResipository extends JpaRepository<Product, Integer> {
	
	public List<Product> findByProductBrand(String productBrand);
	public List<Product> findByProductPrice(int productPrice);
	public List<Product> findByProductSize(int productSize);
	
}

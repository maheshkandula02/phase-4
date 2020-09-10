package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductResipository;
import com.demo.model.Product;
import com.demo.service.ProductService;
@Service

public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductResipository dao;


	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.save(product);
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void deleteProductById(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Product> getAllProductsByProductBrand(String productBrand) {
		// TODO Auto-generated method stub
		return dao.findByProductBrand(productBrand);
	}

	@Override
	public List<Product> getAllProductsByProductPrice(int productPrice) {
		// TODO Auto-generated method stub
		return dao.findByProductPrice(productPrice);
	}

	@Override
	public List<Product> getAllProductsByProductSize(int productSize) {
		// TODO Auto-generated method stub
		return dao.findByProductSize(productSize);
	}

}

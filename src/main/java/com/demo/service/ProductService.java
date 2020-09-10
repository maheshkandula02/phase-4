package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {
	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	public Product getProductById(int id);
	public void deleteProductById(int id);
	public List<Product> getAllProducts();
	public List<Product> getAllProductsByProductBrand(String productBrand);
	public List<Product> getAllProductsByProductPrice(int productPrice);
	public List<Product> getAllProductsByProductSize(int productSize);

}

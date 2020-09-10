package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demo.service.ProductService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class ProductController  {

@Autowired
private ProductService service;

    @PostMapping("/product")
	public Product addProduct(@RequestBody Product product) {
		// TODO Auto-generated method stub
		return service.addProduct(product);
	}
 
    @PutMapping("/product")
	public Product updateProduct(@RequestBody Product product) {
		// TODO Auto-generated method stub
    	return service.updateProduct(product);
	}

    @GetMapping("/product/{id}")
	public Product getProductById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return service.getProductById(id);
	}

    @DeleteMapping("/product/{id}")
	public void deleteProductById(@PathVariable int id) {
		// TODO Auto-generated method stub
    	service.deleteProductById(id);
		
	}

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return service.getAllProducts();
	}

	@GetMapping("/products/productBrand/{productBrand}")
	public List<Product> getAllProductsByProductBrand(@PathVariable String productBrand) {
		// TODO Auto-generated method stub
		return service.getAllProductsByProductBrand(productBrand);
	}

	@GetMapping("/products/productPrice/{productPrice}")
	public List<Product> getAllProductsByProductPrice(@PathVariable int productPrice) {
		// TODO Auto-generated method stub
		return service.getAllProductsByProductPrice(productPrice);
	}

	@GetMapping("/products/productSize/{productSize}")
	public List<Product> getAllProductsByProductSize(@PathVariable int productSize) {
		// TODO Auto-generated method stub
		return service.getAllProductsByProductSize(productSize);
	}

}

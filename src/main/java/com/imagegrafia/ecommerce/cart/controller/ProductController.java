package com.imagegrafia.ecommerce.cart.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imagegrafia.ecommerce.cart.model.Product;
import com.imagegrafia.ecommerce.cart.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	private ProductService productService=new ProductService();
	
	@RequestMapping("/")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
		}
	
	@RequestMapping("id/{id}")
	public Product getProduct(@PathVariable("id") int id) {
		
		return productService.getProduct(id);
	}

}

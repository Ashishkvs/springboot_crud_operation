package com.imagegrafia.ecommerce.cart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.imagegrafia.ecommerce.cart.entity.Product;
import com.imagegrafia.ecommerce.cart.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(method=RequestMethod.GET,value="/all")
	public List<Product> getAllProducts() {

		return productService.getAllProducts();
	}

	@GetMapping(value="id/{id}")
	public Optional<Product> getProduct(@PathVariable("id") int id) {

		return productService.getProduct(id);

	}

	@PostMapping(value = "add")
	public boolean addProduct(@RequestBody Product product) {

		productService.addProduct(product);
		return true;
	}
	
	@PutMapping(value = "update/{id}")
	public boolean updateProduct(@PathVariable int id, @RequestBody Product product) {

		 productService.updateProduct(id,product);
		 return true;
	}

	@DeleteMapping(value = "id/{id}")
	public boolean deleteProduct(@PathVariable("id") int id) {
		productService.deleteProduct(id);
		return true;

	}

}

package com.imagegrafia.ecommerce.cart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imagegrafia.ecommerce.cart.entity.Product;
import com.imagegrafia.ecommerce.cart.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	// get all product list
	public List<Product> getAllProducts() {

		return productRepository.findAll();
	}

	// get single product based on id
	public Optional<Product> getProduct(Integer id) {

		return productRepository.findById(id);

	}

	// add product to database
	public void addProduct(Product product) {

		 productRepository.save(product);
	}

	// delete product
	public void deleteProduct(Integer id) {
		productRepository.deleteById(id);
	}

	// update Product
	public void updateProduct(Integer id, Product productDetails) {
		Product product=productRepository.getOne(id);//product holding prev. detail along with id so no need to set id again
		product.setName(productDetails.getName());
		product.setPrice(productDetails.getPrice());
		product.setUrl(productDetails.getUrl());
		productRepository.save(product);
		
	}
}

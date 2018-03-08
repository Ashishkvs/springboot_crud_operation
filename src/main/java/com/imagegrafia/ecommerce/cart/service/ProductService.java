package com.imagegrafia.ecommerce.cart.service;

import java.util.ArrayList;
import java.util.List;

import com.imagegrafia.ecommerce.cart.model.Product;

public class ProductService {
	private List<Product> allProductList;

	// get all product list
	public List<Product> getAllProducts() {
		allProductList = new ArrayList<>();

		allProductList.add(new Product(1, "Apple mackbook", 2000.56d, "http://images/products/product1.jpg"));
		allProductList.add(new Product(2, "Dell", 2000.56d, "http://images/products/product1.jpg"));
		allProductList.add(new Product(3, "hp", 2000.56d, "http://images/products/product1.jpg"));
		allProductList.add(new Product(4, "Lenovo", 2000.56d, "http://images/products/product1.jpg"));
		allProductList.add(new Product(5, "Acer", 2000.56d, "http://images/products/product1.jpg"));
		allProductList.add(new Product(6, "Toshiba", 2000.56d, "http://images/products/product1.jpg"));

		return allProductList;
	}

	// get single product based on id
	public Product getProduct(int id) {
		// first add all product into the list as there may be a case where list might be empty
		getAllProducts();
			for (Product product : allProductList) {
				if (product.getId() == id) {
				return product;
				}

			}
		return null;

	}
}

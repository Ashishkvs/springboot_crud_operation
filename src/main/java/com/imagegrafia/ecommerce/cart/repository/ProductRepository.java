package com.imagegrafia.ecommerce.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imagegrafia.ecommerce.cart.entity.Product;
/**
 * 
 * @author Ashish
 *extend CrudRepository for crud operation
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}

package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.cart.CartProducts;

public interface CartProductsRepository extends JpaRepository<CartProducts, Integer>{
	
	List<CartProducts> findByProductID(Integer id);

	List<CartProducts> findByQuantity(int quantity);
	
	//<
	List<CartProducts> findByQuantityLessThan(int quantity);
	
	//>=
	List<CartProducts> findByQuantityGreaterThanEqual(int quantity);
	
	//<=
	List<CartProducts> findByQuantityLessThanEqual(int quantity);

	//>
	List<CartProducts> findByQuantityGreaterThan(int quantity);
	
	//Queries on a respective product regarding quantity
	//<
	List<CartProducts> findByProductIDAndQuantityLessThan(Integer productID, int quantity);
	
	//>=
	List<CartProducts> findByProducIDAndQuantityGreaterThanEqual(Integer productID, int quantity);
		
	//<=
	List<CartProducts> findByProductIDAndQuantityLessThanEqual(Integer productID,int quantity);

	//>
	List<CartProducts> findByProductIDAndQuantityGreaterThan(Integer productID, int quantity);
	
}

package com.example.demo.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.cart.ShoppingCarts;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCarts, Integer>{
	
	List<ShoppingCarts> findByCustomerID(Integer customerID);
	
	List<ShoppingCarts> findByCartCreated(LocalDateTime time);
	
	List<ShoppingCarts> findByCartStatusCode(Integer statusCode);
	
	List<ShoppingCarts> findByCartCreatedBeforeAndCartStatusCode(LocalDateTime time, Integer statusCode);
	
	List<ShoppingCarts> findByCartCreatedAfterAndCartStatusCode(LocalDateTime time, Integer statusCode);
	

}

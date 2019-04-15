package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.cart.ShoppingCartStatus;

public interface ShoppingCartStatusRepository extends JpaRepository<ShoppingCartStatus, Integer>{
	
	List<ShoppingCartStatus> findByShoppingCartStatusDescriptionIgnoreCase(String description);

}

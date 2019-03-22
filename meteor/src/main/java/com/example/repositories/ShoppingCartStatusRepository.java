package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.cart.ShoppingCartStatus;

public interface ShoppingCartStatusRepository extends JpaRepository<ShoppingCartStatus, Integer>{
	
	List<ShoppingCartStatus> findByShoppingCartStatusDescriptionIgnoreCase(String description);

}

package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.cart.ShoppingCartStatus;

public interface ShoppingCartStatusRepository extends JpaRepository<ShoppingCartStatus, Integer>{

}

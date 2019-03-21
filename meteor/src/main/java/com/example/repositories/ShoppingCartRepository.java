package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.cart.ShoppingCarts;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCarts, Integer>{

}

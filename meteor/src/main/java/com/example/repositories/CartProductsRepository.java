package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.cart.CartProducts;

public interface CartProductsRepository extends JpaRepository<CartProducts, Integer>{

}

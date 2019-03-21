package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.order.OrderedProducts;

public interface OrderedProductRepository extends JpaRepository<OrderedProducts, Integer>{

}

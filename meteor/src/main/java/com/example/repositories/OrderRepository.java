package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.order.Orders;

public interface OrderRepository extends JpaRepository<Orders,Integer>{

}

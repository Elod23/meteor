package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.order.OrderStatus;

public interface OrderStatusRepository extends JpaRepository<OrderStatus, Integer>{

}

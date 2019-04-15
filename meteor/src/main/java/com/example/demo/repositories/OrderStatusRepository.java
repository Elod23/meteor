package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.order.OrderStatus;

public interface OrderStatusRepository extends JpaRepository<OrderStatus, Integer>{

	List<OrderStatus> findAllByStatusDescription(String description);
	
	OrderStatus findByStatusDescription(String description);
}

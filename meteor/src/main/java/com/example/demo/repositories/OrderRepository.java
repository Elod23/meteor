package com.example.demo.repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.order.Orders;

public interface OrderRepository extends JpaRepository<Orders,Integer>{
	
	List<Orders> findByCustomerID(Integer customerID);
	
	List<Orders> findByBillingName(String billingName);
	
	List<Orders> findByDeliveryName(String deliveryName);
	
	List<Orders> findByEmail(String email);
	
	List<Orders> findByPruchaseDate(Date date);
	
	List<Orders> findByPruchaseDateAndOrderStatusCode(Date date, Integer orderStausCode);
	
	List<Orders> findByPruchaseDateBetween(Date dateStart, Date dateEnd);
	
	List<Orders> findByOrderStatusCode(Integer statusCode);
	
	List<Orders> findByBillingAddressID(Integer addressID);
	
	List<Orders> findByDeliveryAddressID(Integer addressID);

}

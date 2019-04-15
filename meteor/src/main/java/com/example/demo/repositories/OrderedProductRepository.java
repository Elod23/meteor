package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.order.OrderedProducts;

public interface OrderedProductRepository extends JpaRepository<OrderedProducts, Integer>{
	
	List<OrderedProducts> findByNameIgnoreCase(String name);
	
	List<OrderedProducts> findByMeasurementUnit(String MU);
	
	List<OrderedProducts> findBySecondaryMeasurementUnit(String SMU);
	
	List<OrderedProducts> findByPrice(float price);
	
	List<OrderedProducts> findByCantitateStoc(float quantity);
	
	List<OrderedProducts> findByQuantityLessThan(float quantity);

	List<OrderedProducts> findByQuantityLessThanEqual(float quantity);
	
	List<OrderedProducts> findByQuantityGreaterThan(float quantity);
	
	List<OrderedProducts> findByQuantityGreaterThanEqual(float quantity);
	
	List<OrderedProducts> findByCotaTVA(float TVA);
	
	List<OrderedProducts> findByOrderID(float supplierID);
	
	List<OrderedProducts> findBydescription(String description);
	
	List<OrderedProducts> findByProductID(Integer productID);

}

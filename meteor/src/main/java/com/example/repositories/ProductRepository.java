package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.products.Products;

public interface ProductRepository extends JpaRepository<Products, Integer>{
	
	List<Products> findByNameIgnoreCase(String name);
	
	List<Products> findByMeasurementUnit(String MU);
	
	List<Products> findBySecondaryMeasurementUnit(String SMU);
	
	List<Products> findByPrice(float price);
	
	List<Products> findByCantitateStoc(float quantity);
	
	List<Products> findByCantitateStocLessThan(float quantity);

	List<Products> findByCantitateStocLessThanEqual(float quantity);
	
	List<Products> findByCantitateStocGreaterThan(float quantity);
	
	List<Products> findByCantitateStocGreaterThanEqual(float quantity);
	
	List<Products> findByCotaTVA(float TVA);
	
	List<Products> findBySupplierID(float supplierID);
	
	List<Products> findByProductDescription(String description);
}

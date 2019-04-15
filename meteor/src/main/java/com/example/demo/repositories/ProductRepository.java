package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.products.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	List<Product> findByNameIgnoreCase(String name);
	
	List<Product> findByMeasurementUnit(String MU);
	
	List<Product> findBySecondaryMeasurementUnit(String SMU);
	
	List<Product> findByPrice(float price);
	
	List<Product> findByNameAndPrice(String name, float price);
	
	List<Product> findByCantitateStoc(float quantity);
	
	List<Product> findByCantitateStocLessThan(float quantity);

	List<Product> findByCantitateStocLessThanEqual(float quantity);
	
	List<Product> findByCantitateStocGreaterThan(float quantity);
	
	List<Product> findByCantitateStocGreaterThanEqual(float quantity);
	
	List<Product> findByCotaTVA(float TVA);
	
	List<Product> findBySupplierID(float supplierID);
	
	List<Product> findByProductDescription(String description);
	
	@Query("select * from Products inner join Suppliers on Products.SuppllierID = Suppliers.SupplierID where (Suppliers.Name = :name)")
	List<Product> findBySupplierName(@Param("name")String name);
}

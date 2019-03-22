package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.products.Suppliers;

public interface SupplierRepository extends JpaRepository<Suppliers, Integer>{
	
	List<Suppliers> findByCUIIgnoreCase(String CUI);
	
	List<Suppliers> findByNameIgnoreCase(String name);
	
	List<Suppliers> findBySupplierLogoURL(String url);

}

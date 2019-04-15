package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.products.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer>{
	
	List<Supplier> findByCUIIgnoreCase(String CUI);
	
	List<Supplier> findByNameIgnoreCase(String name);
	
	List<Supplier> findBySupplierLogoURL(String url);

}

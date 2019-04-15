package com.example.demo.services.product;

import java.util.List;

import com.example.demo.entities.products.Supplier;

public interface SupplierService {
	Supplier save(Supplier supplier);
	Supplier update(Supplier supplier);
	Supplier delete(Supplier supplier);
	
	List<Supplier> findAll();

}

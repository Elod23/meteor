package com.example.services.product;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.products.Products;
import com.example.repositories.ProductRepository;

@Service
public class ProductServices {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Products getProductByExactName(String name) {
		List<Products> productsWithName = new LinkedList<>();
		productsWithName = productRepository.findByNameIgnoreCase(name);
		
		for(Products prod: productsWithName) {
			if(prod.getName().equals(name))
				return prod;
		}
		return null;
	}
	
	public List<Products> getAllProductsWithName(String name){
		return productRepository.findByNameIgnoreCase(name);
	}
	
	public List<Products> getAllProductsByMeasuerementUnit(String mu){
		return productRepository.findByMeasurementUnit(mu);
	}
	
	public List<Products> getAllProductsBySecondaryMeasuerementUnit(String mu){
		return productRepository.findBySecondaryMeasurementUnit(mu);
	}
	
	public List<Products> getProductsByNameAndPrice(String name, float price){
		return productRepository.findByNameAndPrice(name, price);
	}
	
	public List<Products> getProductsByPrice(float price){
		return productRepository.findByPrice(price);
	}
	
	public List<Products> getProductsWithExactQuantity(float quantity){
		return productRepository.findByCantitateStoc(quantity);
	}
	
	public List<Products> getProductsWithQuantityLessThan(float quantity){
		return productRepository.findByCantitateStocLessThan(quantity);
	}
	
	public List<Products> getProductsWithQuantityLessThanEqual(float quantity){
		return productRepository.findByCantitateStocLessThanEqual(quantity);
	}
	
	public List<Products> getProductsWithQuantityGreaterThan(float quantity){
		return productRepository.findByCantitateStocGreaterThan(quantity);
	}
	
	public List<Products> getProductsWithQuantityGreaterThanEqual(float quantity){
		return productRepository.findByCantitateStocGreaterThanEqual(quantity);
	}
	
	public List<Products> findByTVA(float tva){
		return productRepository.findByCotaTVA(tva);
	}
	
	public List<Products> findBySupplierName(String name){
		return productRepository.findBySupplierName(name);
	}
	
	public List<Products> findByDescriptionExact(String descrip){
		return productRepository.findByProductDescription(descrip);
	}
	
}

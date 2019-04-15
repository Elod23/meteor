package com.example.demo.services.product;

import java.util.List;

import com.example.demo.entities.products.Category;
import com.example.demo.entities.products.Product;
import com.example.demo.entities.products.ProductHasCategory;

public interface ProductService {
	List<Product> getProductsBySupplierIdentifier(int id);
	List<Product> getProductsBySupplierCUI(String CUI);
	List<Product> findBySupplierName(String name);
	
	List<Product> getAllProductsByCategoryId(Integer categoryID);
	List<Product> getAllProductsByCategoryName(String name);
	ProductHasCategory addProductToCategory(Product product, Category category);
	Product save(Product product);
	Product update(Product product);
	Product delete(Product product);
	Product getProductByExactName(String name);
	List<Product> getAllProductsWithName(String name);
	List<Product> getProductsByPrice(float price);
}

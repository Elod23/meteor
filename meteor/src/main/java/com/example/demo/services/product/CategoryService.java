package com.example.demo.services.product;

import java.util.List;

import com.example.demo.entities.products.Category;

public interface CategoryService {
	Category save(Category category);
	Category update(Category category);
	Category delete(Category category);
	
	List<Category> findAll();

}

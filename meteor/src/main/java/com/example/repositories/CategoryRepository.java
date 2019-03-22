package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.products.Categories;

public interface CategoryRepository extends JpaRepository<Categories, Integer>{
	
	List<Categories> findByName(String name);
	
	List<Categories> findByDescriptionIgnoreCase(String description);

}

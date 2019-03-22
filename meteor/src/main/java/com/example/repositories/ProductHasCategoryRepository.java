package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.products.ProductHasCategory;

public interface ProductHasCategoryRepository extends JpaRepository<ProductHasCategory, Integer>{
	
	List<ProductHasCategory> findAllByProductID(Integer ProductID);
	
	List<ProductHasCategory> findAllByCategoryID(Integer CategoryID);

}

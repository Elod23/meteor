package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.products.ProductHasCategory;

public interface ProductHasCategoryRepository extends JpaRepository<ProductHasCategory, Integer>{
	
	ProductHasCategory findByProductID(Integer ProductID);
	
	List<ProductHasCategory> findAllByProductIDGreaterThan(Integer ProductID);
	
	List<ProductHasCategory> findAllByProductIDLesserThan(Integer ProductID);
	
	List<ProductHasCategory> findByCategoryID(Integer CategoryID);
	
	List<ProductHasCategory> findAllByCategoryIDGreaterThan(Integer CategoryID);
	
	List<ProductHasCategory> findAllByCategoryIDLesserThan(Integer CategoryID);

}

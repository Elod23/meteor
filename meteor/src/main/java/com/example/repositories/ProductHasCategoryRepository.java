package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.products.ProductHasCategory;

public interface ProductHasCategoryRepository extends JpaRepository<ProductHasCategory, Integer>{

}

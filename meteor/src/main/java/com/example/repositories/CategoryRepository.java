package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.products.Categories;

public interface CategoryRepository extends JpaRepository<Categories, Integer>{

}

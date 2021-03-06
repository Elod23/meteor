package com.example.demo.services.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.products.Category;
import com.example.demo.repositories.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}

	@Override
	public Category save(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public Category update(Category category) {
		categoryRepository.delete(category);
		return categoryRepository.save(category);
	}

	@Override
	public Category delete(Category category) {
		categoryRepository.delete(category);
		return category;
	}

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

}

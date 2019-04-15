package com.example.services.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.products.ProductHasCategory;
import com.example.demo.repositories.ProductHasCategoryRepository;

@Service
public class ProductHasCategoryServices {

	@Autowired
	private ProductHasCategoryRepository productCategoryRepo;
	
	public List<ProductHasCategory> listAllProductsByCategory(Integer category){
		return productCategoryRepo.findByCategoryID(category);
	}
	
	public List<ProductHasCategory> listAll(){
		return productCategoryRepo.findAll();
	}
	
	public ProductHasCategory getByID(Integer id) {
		return productCategoryRepo.getOne(id);
	}
	
	public void delete(Integer id) {
		productCategoryRepo.delete(productCategoryRepo.getOne(id));
	}
	
	public void clearAll() {
		productCategoryRepo.deleteAll();
	}
	
	public void saveProduct(ProductHasCategory catego) {
		productCategoryRepo.save(catego);
	}
	
}

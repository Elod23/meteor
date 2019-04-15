package com.example.demo.services.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.builder.GenericBuilder;
import com.example.demo.entities.products.Category;
import com.example.demo.entities.products.Product;
import com.example.demo.entities.products.ProductHasCategory;
import com.example.demo.entities.products.Supplier;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.repositories.ProductHasCategoryRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.repositories.SupplierRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private ProductHasCategoryRepository productHasCategoryRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private SupplierRepository supplierRepository;

	public ProductServiceImpl(ProductRepository productRepository,
			ProductHasCategoryRepository productHasCategoryRepository, CategoryRepository categoryRepository,
			SupplierRepository supplierRepository) {
		this.productRepository = productRepository;
		this.productHasCategoryRepository = productHasCategoryRepository;
		this.categoryRepository = categoryRepository;
		this.supplierRepository = supplierRepository;
	}

	/*
	 * Possible methods giving usability regards to Supplier.
	 */
	@Override
	public List<Product> getProductsBySupplierIdentifier(int id) {
		return productRepository.findBySupplierID(id);
	}

	@Override
	public List<Product> getProductsBySupplierCUI(String CUI) {
		List<Supplier> suppliers = supplierRepository.findByCUIIgnoreCase(CUI);
		List<Product> productsForCUI = new ArrayList<>();
		for (Supplier supp : suppliers) {
			productsForCUI.addAll((productRepository.findBySupplierID(supp.getSupplierId())));
		}
		return productsForCUI;
	}

	@Override
	public List<Product> findBySupplierName(String name) {
		return productRepository.findBySupplierName(name);
	}

	/*
	 * Possible methods giving usability regards to Category.
	 */
	@Override
	public List<Product> getAllProductsByCategoryId(Integer categoryID) {
		List<ProductHasCategory> productHasCategory = productHasCategoryRepository.findByCategoryID(categoryID);
		List<Product> productsForCategoryId = new ArrayList<>();
		for (ProductHasCategory record : productHasCategory) {
			productsForCategoryId.add(productRepository.getOne(record.getProductId()));
		}
		return productsForCategoryId;
	}

	@Override
	public List<Product> getAllProductsByCategoryName(String name) {
		List<Product> productsByCategoryName = new ArrayList<>();
		List<Category> categories = categoryRepository.findByName(name);
		List<ProductHasCategory> records = new ArrayList<>();

		for (Category category : categories) {
			records.addAll(productHasCategoryRepository.findByCategoryID(category.getCategoryId()));
		}
		for (ProductHasCategory relation : records) {
			productsByCategoryName.add(productRepository.getOne(relation.getProductId()));
		}
		return productsByCategoryName;
	}
	
	@Override
	public ProductHasCategory addProductToCategory(Product product, Category category) {
		ProductHasCategory record = GenericBuilder.of(ProductHasCategory::new)
										.with(ProductHasCategory::setProductId, product.getProductId())
										.with(ProductHasCategory::setCategoryId, category.getCategoryId())
										.build();
		
		return productHasCategoryRepository.save(record);
	}

	/*
	 * Basic CRUD repository methods with some optional queries for Products.
	 */
	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product update(Product product) {
		productRepository.delete(productRepository.getOne(product.getProductId()));
		return productRepository.save(product);
	}

	@Override
	public Product delete(Product product) {
		productRepository.delete(product);
		return product;
	}

	@Override
	public Product getProductByExactName(String name) {
		List<Product> productsWithName = new ArrayList<>();
		productsWithName = productRepository.findByNameIgnoreCase(name);

		for (Product prod : productsWithName) {
			if (prod.getName().equals(name))
				return prod;
		}
		return null;
	}

	@Override
	public List<Product> getAllProductsWithName(String name) {
		return productRepository.findByNameIgnoreCase(name);
	}

	public List<Product> getAllProductsByMeasuerementUnit(String mu) {
		return productRepository.findByMeasurementUnit(mu);
	}

	public List<Product> getAllProductsBySecondaryMeasuerementUnit(String mu) {
		return productRepository.findBySecondaryMeasurementUnit(mu);
	}

	public List<Product> getProductsByNameAndPrice(String name, float price) {
		return productRepository.findByNameAndPrice(name, price);
	}

	@Override
	public List<Product> getProductsByPrice(float price) {
		return productRepository.findByPrice(price);
	}

	public List<Product> getProductsWithExactQuantity(float quantity) {
		return productRepository.findByCantitateStoc(quantity);
	}

	public List<Product> getProductsWithQuantityLessThan(float quantity) {
		return productRepository.findByCantitateStocLessThan(quantity);
	}

	public List<Product> getProductsWithQuantityLessThanEqual(float quantity) {
		return productRepository.findByCantitateStocLessThanEqual(quantity);
	}

	public List<Product> getProductsWithQuantityGreaterThan(float quantity) {
		return productRepository.findByCantitateStocGreaterThan(quantity);
	}

	public List<Product> getProductsWithQuantityGreaterThanEqual(float quantity) {
		return productRepository.findByCantitateStocGreaterThanEqual(quantity);
	}

	public List<Product> findByTVA(float tva) {
		return productRepository.findByCotaTVA(tva);
	}

	public List<Product> findByDescriptionExact(String descrip) {
		return productRepository.findByProductDescription(descrip);
	}

	

}

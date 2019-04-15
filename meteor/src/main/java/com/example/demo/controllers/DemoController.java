package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.MeteorApplication;
import com.example.demo.entities.builder.GenericBuilder;
import com.example.demo.entities.products.Product;
import com.example.demo.entities.products.Supplier;
import com.example.demo.services.product.ProductService;
import com.example.demo.services.product.SupplierService;

@RestController
public class DemoController {

	@Autowired
	private ProductService productService;

	@Autowired
	private SupplierService supplierService;

	@ResponseBody
	@GetMapping("/")
	Product demoProduct() {

		Supplier supplier = GenericBuilder.of(Supplier::new).with(Supplier::setName, "Supplier1")
				.with(Supplier::setCUI, "J32/1966/12").with(Supplier::setSupplierLogoURL, "logo1").build();

		Product product = GenericBuilder.of(Product::new).with(Product::setName, "Test1")
				.with(Product::setMeasurementUnit, "DB").with(Product::setSecondaryMU, "kg")
				.with(Product::setCotaTVA, 19).with(Product::setPrice, 1.23f).with(Product::setQuantity, 14f)
				.with(Product::setSupplierID, 1).with(Product::setProductDescription, "Test1 descrip true").build();

		supplierService.save(supplier);
		return productService.save(product);

	}
}

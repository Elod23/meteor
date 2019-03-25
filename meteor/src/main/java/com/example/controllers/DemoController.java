package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.products.Products;

@RestController
public class DemoController {

	
	@ResponseBody
	@GetMapping("/prod")
	Products demoProduct() {
		Products prod1 = new Products();
		prod1.setName("product1");
		return prod1;
	}
}

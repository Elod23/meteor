package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entities.products.Products;

@Controller
public class DemoController {

	
	@ResponseBody
	@GetMapping("/prod")
	Products demoProduct() {
		Products prod1 = new Products();
		prod1.setName("product1");
		return prod1;
	}
}

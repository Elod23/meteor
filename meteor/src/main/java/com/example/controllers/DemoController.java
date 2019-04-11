package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

	
	@ResponseBody
	@GetMapping("/")
	public String demoProduct() {
		return "home.html";
	}
}

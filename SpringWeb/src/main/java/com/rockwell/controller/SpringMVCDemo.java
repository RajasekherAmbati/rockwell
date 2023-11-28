package com.rockwell.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringMVCDemo {
	
	@RequestMapping("/productDetails")
	public String getProductDetails()
	{
		return "welcome to spirngwebmvcDemo";
	}
}

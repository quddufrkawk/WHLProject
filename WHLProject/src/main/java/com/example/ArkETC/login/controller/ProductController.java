package com.example.ArkETC.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ArkETC.login.dto.HomeDTO;
import com.example.ArkETC.login.dto.ProductDTO;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ProductController {

	@RequestMapping("/productHome")
	public String ProductLogin() {
		
		return "Product/productHome";
	}
	
	@RequestMapping("/productAdd")
	public String ProductAdd() {
		
		return "Product/productAdd";
	}
	
	@RequestMapping("/inProduct")
	public String inProduct(HttpServletRequest req) {
		
		ProductDTO dto = new ProductDTO();
		
		return "Product/productHome";
	}

}

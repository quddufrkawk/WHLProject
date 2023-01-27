package com.example.ArkETC.login.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.ArkETC.login.dto.ProductDTO;
import com.example.ArkETC.login.service.ProductService;


@Controller
public class ProductController {
	
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private ProductService productService;

	@RequestMapping("/productHome")
	public String ProductLogin() throws Exception {
		
		return "Product/productHome";
	}
	
	@RequestMapping("/seProduct")
	@ResponseBody
	public List<ProductDTO> seProduct() throws Exception {
		
		List<ProductDTO> seProduct = new ArrayList<>();
		seProduct = productService.seProduct();
		
		return seProduct;
	}
	
	@RequestMapping("/productAdd")
	public String ProductAdd() {
		
		return "Product/productAdd";
	}
	
	@RequestMapping("/inProduct")
	@ResponseBody
	public void inProduct(@RequestParam("name") String name, @RequestParam("price") String price, @RequestParam("count") String count, @RequestParam("id") String id) throws Exception {
		
		ProductDTO dto = new ProductDTO();
		
		dto.setProductName(name);
		dto.setProductPrice(price);
		dto.setProductCount(count);
		dto.setProductSeller(id);
		
		productService.inProduct(dto);
	}
	
	@RequestMapping("/productDeView")
	public String ProductDeView(@RequestParam("code") String code) {
		
		log.info(" check req : " + code);
		
		ModelAndView mav = new ModelAndView();
		
		return "Product/productDeView";
	}
	
	@RequestMapping("/deProduct")
	@ResponseBody
	public void deProduct(@RequestParam("code") String code, @RequestParam("ip") String ip, @RequestParam("id") String id) throws Exception {
		
		ProductDTO dto = new ProductDTO();
		
		log.info(" check ip : " + code + " :: " + ip + " :: " + id);
		
		dto.setProductCode(code);
		dto.setIp(ip);
		dto.setId(id);
		
		productService.inProductViewCount(dto);
	}
}

package com.example.ArkETC.login.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ArkETC.login.dto.ProductDTO;

@Service
public interface ProductService {
	void inProduct(ProductDTO dto) throws Exception;
	
	List<ProductDTO> seProduct() throws Exception;

}

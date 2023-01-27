package com.example.ArkETC.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ArkETC.login.dto.ProductDTO;
import com.example.ArkETC.login.mapper.ProductMapper;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;
	
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void inProduct(ProductDTO dto) throws Exception {
		productMapper.inProduct(dto);
	}

	@Override
	public List<ProductDTO> seProduct() throws Exception {
		List<ProductDTO> result = productMapper.seProduct(); 
		return result;
	}

	@Override
	public void inProductViewCount(ProductDTO dto) throws Exception {
		productMapper.inProductViewCount(dto);
	}
}

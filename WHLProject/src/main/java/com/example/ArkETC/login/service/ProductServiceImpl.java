package com.example.ArkETC.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ArkETC.login.mapper.ProductMapper;

@Service
public class ProductServiceImpl {

	@Autowired
	private ProductMapper productMapper;
	
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}

}

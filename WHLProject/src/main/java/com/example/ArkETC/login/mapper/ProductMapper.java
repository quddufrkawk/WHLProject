package com.example.ArkETC.login.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.ArkETC.login.dto.ProductDTO;

@Mapper
public interface ProductMapper {
	void inProduct(ProductDTO dto);
	
	List<ProductDTO> seProduct();

}

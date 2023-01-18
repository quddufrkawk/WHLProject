package com.example.ArkETC.login.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.ArkETC.login.dto.HomeDTO;

@Mapper
public interface HomeMapper {
	List<HomeDTO> checkUser(HomeDTO dto);
}

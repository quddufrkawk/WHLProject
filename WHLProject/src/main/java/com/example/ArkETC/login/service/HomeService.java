package com.example.ArkETC.login.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ArkETC.login.dto.HomeDTO;

@Service
public interface HomeService {
	List<HomeDTO> checkUser(HomeDTO dto) throws Exception;
	
	void createUser(HomeDTO dto) throws Exception;
	
	int checkUserPw(HomeDTO dto) throws Exception;
	
	String findUser(String id) throws Exception;
}
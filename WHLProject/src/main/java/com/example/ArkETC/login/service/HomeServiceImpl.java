package com.example.ArkETC.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ArkETC.login.dto.HomeDTO;
import com.example.ArkETC.login.mapper.HomeMapper;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	private HomeMapper homeMapper;

	@Override
	public List<HomeDTO> checkUser(HomeDTO dto) throws Exception {
		List<HomeDTO> result = homeMapper.checkUser(dto);
		return result;
	}

	@Override
	public void createUser(HomeDTO dto) throws Exception {
		homeMapper.createUser(dto);
	}

	@Override
	public int checkUserPw(HomeDTO dto) throws Exception {
		return homeMapper.checkUserPw(dto);
	}

	@Override
	public String findUser(String id) throws Exception {
		return homeMapper.findUser(id);
	}
}

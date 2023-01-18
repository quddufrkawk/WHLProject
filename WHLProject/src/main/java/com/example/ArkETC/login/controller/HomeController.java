package com.example.ArkETC.login.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.ArkETC.login.dto.HomeDTO;
import com.example.ArkETC.login.service.HomeService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private HomeService homeService;
	/*
	@RequestMapping("/")
	public String Home() {
		return "homeLogin";
	}
	*/
	
	@RequestMapping("/loginCheck")
	@ResponseBody
	public List<HomeDTO> loginCheck(HttpServletRequest req) throws Exception {
		HomeDTO dto = new HomeDTO();

		dto.setId(req.getParameter("id"));
		dto.setPassword(req.getParameter("pw"));
		
		List<HomeDTO> result = homeService.checkUser(dto);
		
		log.info("log : " + homeService.checkUser(dto));
		log.info("--- loginCheck dto --- : " + dto);
		
		return result;
	}

}

package com.example.ArkETC.login.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.ArkETC.login.dto.HomeDTO;
import com.example.ArkETC.login.service.HomeService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private HomeService homeService;
	
	@Autowired
	private PasswordEncoder bCryptPasswordEncoder;
	
	@RequestMapping({"/" , "/home", "/homeLogin"})
	public String Home() {
		return "/homeLogin";
	}
	
	
	@RequestMapping("/loginCheck")
	@ResponseBody
	public List<HomeDTO> loginCheck(HttpServletRequest req) throws Exception {
		HomeDTO dto = new HomeDTO();

		dto.setId(req.getParameter("id"));
		
		// 관리자 계정 로그인 편의성
		if(dto.getId().equals("admin")){
			dto.setPassword(req.getParameter("pw"));
			List<HomeDTO> result = homeService.checkUser(dto);
			
			return result;
		}else {
			dto.setPassword(homeService.findUser(dto.getId()));
		}

		if(bCryptPasswordEncoder.matches(req.getParameter("pw"), dto.getPassword())) {			
			List<HomeDTO> result = homeService.checkUser(dto);
			
			return result;
		}
		else {
			return null;
		}
	}
	
	@RequestMapping("/createUserForm")
	public String createUserForm() throws Exception {
		
		return "/homeCreate";
	}
	
	@RequestMapping("/createUser")
	public String createUser(@RequestParam("id") String id, @RequestParam("password") String pw, @RequestParam("name") String name) throws Exception {
		HomeDTO dto = new HomeDTO();
		
		dto.setId(id);
		dto.setPassword(bCryptPasswordEncoder.encode(pw));		
		dto.setName(name);
		
		homeService.createUser(dto);
		
		return "/homeLogin";
	}

}

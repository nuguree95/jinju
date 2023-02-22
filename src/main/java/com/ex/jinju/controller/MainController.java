package com.ex.jinju.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/main")
public class MainController {
	
	@GetMapping("")
	public String Main(HttpServletRequest req) {
		
		

		return "main";
	}
	
	@GetMapping("userInfo")
	public String goUserInfo(HttpServletRequest req) {
		
		
		return "userInfo";
	}
	
	@GetMapping("logout")
	public String logOut() {
		
		return "logout";
	}
	
	@GetMapping("delete")
	public String deleteUser() {
		
		return "deleteUser";
	}

}

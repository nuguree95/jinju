package com.ex.jinju.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ex.jinju.dto.AddDTO;
import com.ex.jinju.dto.req.LoginDTO;
import com.ex.jinju.dto.res.UserInfoDTO;
import com.ex.jinju.service.UserService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("signup")
	public String addPage() {
		
		return "signUp";
	}
	
	@PostMapping("add")
	public ModelAndView addUser(AddDTO dto) {
		ModelAndView mav = new ModelAndView();
		int i = userService.addUser(dto);
		
		if(i >0 ) {
			mav.setViewName("redirect:/main");
		} else {
			mav.setViewName("redirect:/signUp");
		}
		
		return mav;
		
		
	}

	@GetMapping("godelete")
	public String goDelete() {
		
		return "delete";
	}
	
	@PostMapping("delete")
	public ModelAndView deleteUser(LoginDTO dto,HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		int i = userService.deleteUser(dto);
		if (i > 0) {
			 req.getSession().invalidate();
			 mav.setViewName("redirect:/main");
		}else {
			log.info("실패함");
		}
		
		return mav;
	}
	
	@PostMapping("update")
	public ModelAndView  updateUser(UserInfoDTO dto,HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		int i = userService.updateUser(dto);
		
		if (i > 0) {
			req.getSession().setAttribute("userInfo", dto);
			mav.setViewName("redirect:/main");
		} else {
			log.info("실패함");
		}
		
		return mav;
		
		
	}
	

}

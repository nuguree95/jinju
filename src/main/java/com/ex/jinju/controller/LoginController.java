package com.ex.jinju.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ex.jinju.dto.req.LoginDTO;
import com.ex.jinju.dto.res.UserInfoDTO;
import com.ex.jinju.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@GetMapping("")
	public String loginPage() {
		
		return "loginPage";
	}
	
	@PostMapping("go")
	public ModelAndView goLogin(LoginDTO loginDTO, RedirectAttributes rttr,HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		UserInfoDTO userInfoDTO = loginService.goLogin(loginDTO);
		
		if (userInfoDTO != null) {
			//있으면 유지 없으면 만듬 
			HttpSession session = req.getSession();
			session.setAttribute("userInfo", userInfoDTO);
			
			
			mav.setViewName("redirect:/main");
		} else {
			mav.setViewName("redirect:/login");
		}
		
		
		
		return mav;
		
	}

}

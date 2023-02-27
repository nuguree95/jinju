package com.ex.jinju.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ex.jinju.dto.BoardDTO;
import com.ex.jinju.dto.res.UserInfoDTO;
import com.ex.jinju.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@GetMapping("")
	public String goBoard() {
		
		return "boardPage";
	}
	
	@GetMapping("page")
	public String goPage() {
		return "addBoard";
	}
	
	
	@PostMapping("add")
	public ModelAndView addBoard(BoardDTO dto, HttpServletRequest req) {	
		UserInfoDTO userInfoDTO = (UserInfoDTO)req.getSession().getAttribute("userInfo");
		
		boardService.addBoard(dto);
		
		return null;
	}
	
	

}

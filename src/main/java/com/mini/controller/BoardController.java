package com.mini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mini.service.BoardService;

@Controller
public class BoardController { 

	@Autowired
	private BoardService boardService;
	
	@GetMapping(value = "/board/index.do")
	public String openBoardWrite(Model model) {
		return "board/index";
	}

}

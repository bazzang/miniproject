package com.mini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	@GetMapping(value = "/board/write.do")
	public String openBoardWrite(Model model) {
		return "board/write";
	}
}

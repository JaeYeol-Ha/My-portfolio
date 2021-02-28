package com.creativity.board.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping(value = { "/", "index" })
	public String index() {
		return "index";
	}

	@GetMapping("/aboutme")
	public String aboutme() {
		return "aboutme";
	}

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

	@GetMapping("/myportfolio")
	public String myportfolio() {
		return "myportfolio";
	}

	@GetMapping("/today")
	public String today(Model model) {
		LocalDateTime currentDateTime = LocalDateTime.now();
		String time = currentDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
		model.addAttribute("time", time);
		return "today";
	}
}

package com.mycompany.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.java.Log;

@Controller
@Log
@RequestMapping("/thymeleaf")
public class ThymeleafController {
	@RequestMapping("/content")
	public String content() {
		log.info("실행");
		return "thymeleaf/content";
	}
}

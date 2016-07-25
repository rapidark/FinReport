package com.finreport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticContentController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}

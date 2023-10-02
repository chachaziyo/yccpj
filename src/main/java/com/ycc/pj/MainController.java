package com.ycc.pj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MainController {
	
	@RequestMapping("/")
	public String root() {
		return "index";
	}
	
	
	@RequestMapping("/header")
	public String header() {
		return "/common/header";
	}
}

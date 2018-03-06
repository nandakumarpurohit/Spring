package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("sayhello")
	public ModelAndView testHello() {
		
		String data = "Welcome to Spring MVC!";
		
		return new ModelAndView("hello", "sampleMessage", data);
		
	}

}

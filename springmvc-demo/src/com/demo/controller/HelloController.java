package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("sayHello")
	public ModelAndView wishMeHello() {
		
		String info = "All The Best for Spring MVC learning!";
		
		return new ModelAndView("hello", "simpleMessage", info);
		
	}

}

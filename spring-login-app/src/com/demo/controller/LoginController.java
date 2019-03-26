package com.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.model.LoginForm;

@Controller("login")
public class LoginController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String loadLoginForm(Map model) {
		
		LoginForm loginForm = new LoginForm();
		model.put("loginForm", loginForm);
		
		return "login";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String processLogin(LoginForm loginForm, BindingResult result, Map model) {
		
		if(loginForm.getUsername().equals("Admin"))
			return "dashboard";
		
		return "error";
	}
	
	
	

}

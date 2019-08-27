package com.pragim.loginapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pragim.loginapp.model.LoginBean;

@Controller
public class LoginController {
	
	
	
	
	@PostMapping(value="/login",headers = "content-type=application/x-www-form-urlencoded")
	public ModelAndView login(@RequestBody LoginBean login) {
		
		if("pragim".equalsIgnoreCase(login.getUname()) && "pragim".equals(login.getPwd()))
			return new ModelAndView("success", "msg", "Welcome to spring MVC!!!!");
		else
			return new ModelAndView("failure", "msg", "login Failed");
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String displayLogin(Model model) {
		
		model.addAttribute("login", new LoginBean()); 
		return "login";
	}

}

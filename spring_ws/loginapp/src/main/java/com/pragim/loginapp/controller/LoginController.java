package com.pragim.loginapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pragim.loginapp.model.LoginBean;

@Controller
public class LoginController {

	@PostMapping(value = "/login")
	public ModelAndView login(@ModelAttribute("login") LoginBean login) {

		if ("pragim".equalsIgnoreCase(login.getUname()) && "pragim".equals(login.getPwd()))
			return new ModelAndView("success", "msg", "Welcome to spring MVC!!!!");
		else
			return new ModelAndView("failure", "msg", "login Failed");
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView displayLogin() {

		//model.addAttribute("login", new LoginBean());
		return new ModelAndView("login", "login", new LoginBean());
	}

}

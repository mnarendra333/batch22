package com.pragim.phonebookapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pragim.phonebookapp.model.PhoneBook;

@Controller
public class PhoneBookController {
	
	@Autowired
	private JdbcTemplate template;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView displayPhoneBookPage() {
		
		return new ModelAndView("addContact", "phonebook", new PhoneBook());
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ModelAndView addPhoneBook(@ModelAttribute("phonebook") PhoneBook phonebook) {
		ModelAndView mav = null;
		int count = template.update("insert into phonebook values(?,?,?)",phonebook.getName(),phonebook.getPhoneNo(),phonebook.getProvider());
		System.out.println("record inserted!!");
		if(count==1)
			mav =  new ModelAndView("addContact", "msg", "contact added successfully");
		return mav;
	}
	
	
}

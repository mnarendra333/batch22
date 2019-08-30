package com.pragim.phonebookapp.controller;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pragim.phonebookapp.model.PhoneBook;

@Controller
public class PhoneBookController {
	
	@Autowired
	private JdbcTemplate template;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String displayPhoneBookPage(Model model) {
		System.out.println(this.hashCode());
		model.addAttribute("phonebook",new PhoneBook());
		return "redirect:/list";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addPhoneBook(@ModelAttribute("phonebook") PhoneBook phonebook) {
		ModelAndView mav = null;
		int count = template.update("insert into phonebook values(?,?,?,phonebk_seq.nextval)",phonebook.getName(),phonebook.getPhoneNo(),phonebook.getProvider());
		System.out.println("record inserted!!");
		String message = null;
		if(count>0)
			message = "contact added successfully";
		return "redirect:/list?msg="+message;
	}
	
	//@RequestMapping(value="/list",method=RequestMethod.GET)
	@GetMapping("/list")
	public String getContacts(Model model,HttpServletRequest request) {
		System.out.println(this.hashCode());
		List<PhoneBook> list = template.query("select * from phonebook", new RowMapper<PhoneBook>() {

			@Override
			public PhoneBook mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				
				ResultSetMetaData metaData = rs.getMetaData();
				
				PhoneBook book = new PhoneBook();
				book.setName(rs.getString(1));
				book.setPhoneNo(rs.getString(2));
				book.setProvider(rs.getString(3));
				book.setId(rs.getInt(4));
				return book;
			}
		});
		int count = 0;
		String countObj = request.getParameter("count");
		if(countObj!=null)
			count = Integer.parseInt(countObj);
		
		list.forEach(System.out::println);
		model.addAttribute("phonebook", new PhoneBook());
		model.addAttribute("bookdata",list);
		
		if(count>0)
			model.addAttribute("msg", "contact added successfully");
		return "addContact";
	}
	
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String delete(@RequestParam(name="id") String id) {
		int phid = Integer.parseInt(id);
		String message = null;
		int count = template.update("delete from phonebook where id=?",phid);
		System.out.println("record inserted!!");
		if(count==1)
			message = "contact deleted successfully";
		return "redirect:/list?msg="+message;
	}
	
	
}

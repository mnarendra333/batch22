package com.pragim.requestdispatcherdemo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//collect form data
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		String parameter = req.getParameter("number");
		int no = Integer.parseInt(parameter);
		
		int square = no*no;
		
		out.println("square value is "+square);
		
		//do dispatch from srv1 to srv2
		
		RequestDispatcher rd = req.getRequestDispatcher("success.jsp");
		rd.include(req, resp);
		
	}

}

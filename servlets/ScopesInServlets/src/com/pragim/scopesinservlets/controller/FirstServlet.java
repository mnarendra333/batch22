package com.pragim.scopesinservlets.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//collect form data
		
		
		String username = request.getParameter("name");
		String age = request.getParameter("age");
		String phno = request.getParameter("phoneno");
		
		
		
		//set the data to request
		request.setAttribute("name1", username);
		request.setAttribute("age1", age);
		request.setAttribute("phno1", phno);
		
		//set the data to session
		
		HttpSession session = request.getSession();
		session.setAttribute("name2", username);
		session.setAttribute("age2", age);
		session.setAttribute("phno2", phno);
		
		
		//set the data to context
		
		ServletContext ctx = getServletContext();
		ctx.setAttribute("name3", username);
		ctx.setAttribute("age3", age);
		ctx.setAttribute("phno3", phno);
		
		
		
		
	}

}

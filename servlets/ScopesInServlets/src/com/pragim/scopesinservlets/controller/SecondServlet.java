package com.pragim.scopesinservlets.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		//collect the data from request
		String name1 = (String)request.getAttribute("name1");
		String age1 = (String)request.getAttribute("age1");
		String phno1 = (String)request.getAttribute("phno1");
		
		out.println("=======request data=============");
		out.println("name is "+name1);
		out.println("age is "+age1);
		out.println("phone no is "+phno1);
		
		HttpSession session = request.getSession();
		//collect the data from session
		String name2 = (String)session.getAttribute("name2");
		String age2 = (String)session.getAttribute("age2");
		String phno2 = (String)session.getAttribute("phno2");
		
		out.println("=======session data=============");
		out.println("name is "+name2);
		out.println("age is "+age2);
		out.println("phone no is "+phno2);
		
		
		//collect the data from context
		ServletContext ctx = getServletContext();
		String name3 = (String)ctx.getAttribute("name3");
		String age3= (String)ctx.getAttribute("age3");
		String phno3 = (String)ctx.getAttribute("phno3");
		
		out.println("=======context data=============");
		out.println("name is "+name3);
		out.println("age is "+age3);
		out.println("phone no is "+phno3);
		
		
		
	}

}

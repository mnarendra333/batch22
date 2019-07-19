package com.pragim.httpsessionwithcookies.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/srv2")
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
		
		
		//fetch form data
		
		String qualification = request.getParameter("quali");
		String year = request.getParameter("year");
		String university = request.getParameter("univ");
		
		
		HttpSession session = request.getSession();
		session.setAttribute("qualification", qualification);
		session.setAttribute("year", year);
		session.setAttribute("university", university);
		
		//generate form3
		
		RequestDispatcher rd = request.getRequestDispatcher("form3.jsp");
		rd.include(request, response);
		
	}

}

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
 * Servlet implementation class FirstServlet
 */
@WebServlet("/srv1")
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
		
		
		//fetch data from form1
		
		String perName = request.getParameter("pname");
		String fathersName = request.getParameter("fname");
		String phNo = request.getParameter("phoneno");
		String emailId = request.getParameter("email");
		
		
		HttpSession session = request.getSession();
		session.setAttribute("perName", perName);
		session.setAttribute("fathersName", fathersName);
		session.setAttribute("phNo", phNo);
		session.setAttribute("emailId", emailId);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("form2.jsp");
		rd.include(request, response);
		
		
		
	}

}

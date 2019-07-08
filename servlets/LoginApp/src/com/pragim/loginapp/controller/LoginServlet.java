package com.pragim.loginapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pragim.loginapp.utility.ConnectionUtility;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		try {
			
			Connection conn = ConnectionUtility.getConnectionFromDB();
			PreparedStatement prepareStatement = conn.prepareStatement("select username from userlist where username=? and password=?");
			prepareStatement.setString(1, username);
			prepareStatement.setString(2, password);
			
			ResultSet executeQuery = prepareStatement.executeQuery();
		
			if(executeQuery.next())
				out.println("<h2><font color='green'>Login Success</font></h2>");
			else
				out.println("<h2><font color='red'>Login Failed</font></h2>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package com.pragim.httpsessionwithcookies.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pragim.httpsessionwithcookies.utility.ConnectionUtility;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/srv3")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//fetch form data
		
				String skill = request.getParameter("skill");
				String exp = request.getParameter("exp");
				String sal = request.getParameter("sal");
				String loc = request.getParameter("loc");
				
				
				
				HttpSession session = request.getSession();
				
				//retrive form1 data 
				String perName = (String)session.getAttribute("perName");
				String fathersName = (String)session.getAttribute("fathersName");
				String phNo = (String)session.getAttribute("phNo");
				String emailId = (String)session.getAttribute("emailId");
				
				//retrive form2 data 
				String qualification = (String)session.getAttribute("qualification");
				String year = (String)session.getAttribute("year");
				String university = (String)session.getAttribute("university");
				
				
				//conversions
				
				
				
				try {
					
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					
					Date yearParsed = sdf.parse(year);
					java.sql.Date date = new java.sql.Date(yearParsed.getTime());
					
					Connection conn = ConnectionUtility.getConnectionFromDB();
					
					PreparedStatement pstmt = conn.prepareStatement("insert into reg_form_data values(reg_form_seq.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?)");
					
					pstmt.setString(1, perName);
					pstmt.setString(2, fathersName);
					pstmt.setString(3, phNo);
					pstmt.setString(4, emailId);
					pstmt.setString(5, qualification);
					pstmt.setDate(6, date);
					pstmt.setString(7, university);
					pstmt.setString(8, skill);
					pstmt.setString(9, exp);
					pstmt.setString(10, sal);
					pstmt.setString(11, loc);
				
					
					
					int count = pstmt.executeUpdate();
					
					if(count>0) {
						
						RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
						rd.forward(request, response);
					
					}
				} catch (Exception e) {
					
					
					e.printStackTrace();
				}
				
				
				
		
	}

}

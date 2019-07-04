package com.pragim.regapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.pragim.regapp.utility.ConnectionUtility;
import com.pragim.regapp.utility.RegUtility;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//common settings
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		//collect form data
		
		try {
			String firstName = request.getParameter("fname");
			String lastName = request.getParameter("lname");
			String gender = request.getParameter("gen");
			String city = request.getParameter("city");
			
			String dob = request.getParameter("dob");
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date dobDt = sdf.parse(dob);
			
			//conver util date into sql date
			java.sql.Date sql_StartDate = new java.sql.Date( dobDt.getTime() );
			
			String address = request.getParameter("addr");
			
			String[] hob = request.getParameterValues("hob");
			String finalHobbies = RegUtility.convertStringArrayIntoString(hob);
			
			String[] skills = request.getParameterValues("skills");
			
			String finalSkillList = RegUtility.convertStringArrayIntoString(skills);
			
			
			
			//jdbc code
			
			Connection conn = ConnectionUtility.getConnectionFromDB();
			
			PreparedStatement pstmt = conn.prepareStatement("insert into regst_tab values(regst_seq.nextval,?,?,?,?,?,?,?,?)");
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			pstmt.setString(3, gender);
			pstmt.setString(4, city);
			pstmt.setDate(5, sql_StartDate);
			pstmt.setString(6,address);
			pstmt.setString(7, finalHobbies);
			pstmt.setString(8, finalSkillList);
			
			int count = pstmt.executeUpdate();
			if(count>0)
				pw.println("<h2><font color='green'>Registration completed successfully</font></h2>");
				
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}

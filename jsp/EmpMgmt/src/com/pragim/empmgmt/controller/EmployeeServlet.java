package com.pragim.empmgmt.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pragim.empmgmt.model.Employee;
import com.pragim.empmgmt.utility.ConnectionUtility;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/getemps")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			Connection conn = ConnectionUtility.getConnectionFromDB();
		
			PreparedStatement pstmt = conn.prepareStatement("select * from emp_data");
			ResultSet rs = pstmt.executeQuery();
			
			
			List<Employee> empList = new ArrayList<Employee>();
			while (rs.next()) {
				Employee e = new Employee();
				e.setEmpId(rs.getInt(1));
				e.setEmpName(rs.getString(2));
				e.setSal(rs.getInt(3));
				e.setHireDate(rs.getDate(4));
				empList.add(e);
			}
			
			
			request.setAttribute("elist", empList);
			
			RequestDispatcher rd = request.getRequestDispatcher("displayEmp.jsp");
			rd.forward(request, response);
			//convert rs into list
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}

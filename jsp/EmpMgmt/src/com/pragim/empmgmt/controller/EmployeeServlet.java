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

import com.pragim.empmgmt.dao.EmployeeDAOImpl;
import com.pragim.empmgmt.model.Employee;
import com.pragim.empmgmt.utility.ConnectionUtility;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/empsrv")
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
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String id = request.getParameter("empid");
		String action = request.getParameter("action");
		
		
		String ename = request.getParameter("empname");
		String sal = request.getParameter("sal");
		String doj = request.getParameter("doj");

		try {

			EmployeeDAOImpl obj = new EmployeeDAOImpl();
			if ("delete".equalsIgnoreCase(action)) {

				String message = obj.deleteEmpById(Integer.parseInt(id));
				request.setAttribute("message", message);
			}else if("store".equalsIgnoreCase(action)) {
				String message = obj.saveEmployeeData(ename, sal, doj);
				request.setAttribute("message", message);
			}

			List<Employee> employeeList = obj.getEmployeeList();
			request.setAttribute("elist", employeeList);

			RequestDispatcher rd = request.getRequestDispatcher("displayEmp.jsp");
			rd.forward(request, response);
			// convert rs into list
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

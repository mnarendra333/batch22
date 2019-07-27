package com.pragim.empmgmt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.pragim.empmgmt.model.Employee;
import com.pragim.empmgmt.utility.ConnectionUtility;

public class EmployeeDAOImpl {

	static Connection con = null;

	static {
		con = ConnectionUtility.getConnectionFromDB();
	}

	public String deleteEmpById(int id) {
		String message = null;
		try {
			PreparedStatement prepareStatement = con.prepareStatement("delete from emp_data where emp_id=?");
			prepareStatement.setInt(1, id);
			int executeUpdate = prepareStatement.executeUpdate();
			if (executeUpdate > 0)
				message = "employee deleted successfully";
		} catch (Exception e) {
			e.printStackTrace();
		}

		return message;

	}
	
	public String saveEmployeeData(String name, String sal, String doj) {
		String message = null;
		try {
			PreparedStatement prepareStatement = con.prepareStatement("insert into emp_data values(emp_data_seq.NEXTVAL,?,?,?)");
			prepareStatement.setString(1, name);
			prepareStatement.setFloat(2, Float.parseFloat(sal));
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-dd-mm");
			Date parse = sdf.parse(doj);
			java.sql.Date sqlDate = new java.sql.Date(parse.getTime());
			prepareStatement.setDate(3, sqlDate);
			int executeUpdate = prepareStatement.executeUpdate();
			if (executeUpdate > 0)
				message = "employee inserted successfully";
		} catch (Exception e) {
			e.printStackTrace();
		}

		return message;

	}

	public List<Employee> getEmployeeList(){
		List<Employee> empList = null;
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from emp_data");
			
			ResultSet rs = pstmt.executeQuery();
			
			
			empList = new ArrayList<Employee>();
			while (rs.next()) {
				Employee e = new Employee();
				e.setEmpId(rs.getInt(1));
				e.setEmpName(rs.getString(2));
				e.setSal(rs.getInt(3));
				e.setHireDate(rs.getDate(4));
				empList.add(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empList;
	}

}

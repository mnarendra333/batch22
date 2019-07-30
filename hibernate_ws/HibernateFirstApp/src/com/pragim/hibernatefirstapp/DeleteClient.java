package com.pragim.hibernatefirstapp;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.pragim.hibernatefirstapp.entity.Employee;

public class DeleteClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Configuration cfg = new Configuration();
		Session session = cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		
		Employee emp = new Employee();
		emp.setEmpId(101);
		
		
		session.delete(emp);
		
		session.beginTransaction().commit();
	}

}

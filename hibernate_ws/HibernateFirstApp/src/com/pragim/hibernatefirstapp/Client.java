package com.pragim.hibernatefirstapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pragim.hibernatefirstapp.entity.Employee;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		//prepare entiry
		Employee obj = new Employee();
		obj.setEmpId(101);
		obj.setEmpName("surya");
		obj.setSal(60000);
		
		Transaction tx = session.beginTransaction();
		session.save(obj);
		tx.commit();
		System.out.println("object inserted!!!");
		

	}

}

package com.pragim.bulkoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pragim.bulkoperations.model.College;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		
		
		College obj2 = new College();
		obj2.setName("NEWHorizon");
		obj2.setAddress("hyd");
		
		Transaction tx = session.beginTransaction();
		session.save(obj2);
		tx.commit();
		System.out.println("saved!!!");
		
		closeSession(sessionFactory,session);
	}

	private static void closeSession(SessionFactory sessionFactory, Session session) {
		session.close();
		sessionFactory.close();
	}

}

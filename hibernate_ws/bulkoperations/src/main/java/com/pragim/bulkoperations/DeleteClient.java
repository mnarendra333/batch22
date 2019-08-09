package com.pragim.bulkoperations;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = null;
		Session session = null;
		
		try {
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			session = sessionFactory.openSession();
			
			
			Query createQuery = session.createQuery("delete from College");
			int count = createQuery.executeUpdate();
			System.out.println(count+" rows effected");
			session.beginTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			session.close();
			sessionFactory.close();
			
		}

	}

}

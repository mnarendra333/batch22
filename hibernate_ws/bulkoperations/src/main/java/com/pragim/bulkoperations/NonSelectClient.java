package com.pragim.bulkoperations;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class NonSelectClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Session session = sessionFactory.openSession();
			
			/*
			 * Query createQuery =
			 * session.createQuery("update College c set c.address=:address");
			 * createQuery.setString("address", "bangl");
			 */
			Query createQuery = session.createQuery("update College c set c.name=? where c.id=?");
			createQuery.setParameter(0, "Geethams");
			createQuery.setParameter(1, 240);
			int count = createQuery.executeUpdate();
			System.out.println(count+" rows effected");
			Transaction beginTransaction = session.beginTransaction();
			beginTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}

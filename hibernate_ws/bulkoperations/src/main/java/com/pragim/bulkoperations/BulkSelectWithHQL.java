package com.pragim.bulkoperations;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pragim.bulkoperations.model.College;

public class BulkSelectWithHQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		
		
		Query query = session.createQuery("from College");
		List<College> list = query.list();
		for (College college : list) {
			System.out.println(college);
		}

	}

}

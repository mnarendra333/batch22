package com.pragim.bulkoperations;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pragim.bulkoperations.model.College;

public class CriteriaClient {
	
	
	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		
		Criteria crit = session.createCriteria(College.class);
		List<College> list = crit.list();
		list.forEach(item->System.out.println(item));
		
	}

}

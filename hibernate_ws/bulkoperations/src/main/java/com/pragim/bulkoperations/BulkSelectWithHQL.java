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
		
		
		
		//select complete object
		
		Query query = session.createQuery("select c from College c");
		List<College> list = query.list();
		for (College college : list) {
			System.out.println(college);
		}
		System.out.println("==========================================");
		//select partial object
		
		Query query2 = session.createQuery("select c.name,c.address from College c");
		List<Object[]> list2 = query2.list();
		for (Object[] objects : list2) {
			System.out.println(objects[0]+" "+objects[1]);
		}
		
		//select single property
		
		Query query3 = session.createQuery("select c.name from College c");
		@SuppressWarnings("unchecked")
		List<String> list3 = query3.list();
		//list3.forEach(item->System.out.println(item));
		list3.forEach(System.out::println);
	}

}

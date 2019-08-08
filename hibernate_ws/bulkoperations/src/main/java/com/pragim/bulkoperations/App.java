package com.pragim.bulkoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pragim.bulkoperations.model.College;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		College college = (College) session.get(College.class, 1);
		System.out.println(college.getName()+" "+college.getAddress());
		College college1 = (College) session.get(College.class, 1);
		System.out.println(college1.getName()+" "+college1.getAddress());
		 
    }
}

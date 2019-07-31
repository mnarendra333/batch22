package com.pragim.hibernatecrud.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pragim.hibernatecrud.model.Product;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Product product = new Product();
		product.setProId(10001);
		product.setProName("Dell-Inspiron15");
		product.setPrice(78000);
		
		session.save(product);
		tx.commit();
		

	}

}

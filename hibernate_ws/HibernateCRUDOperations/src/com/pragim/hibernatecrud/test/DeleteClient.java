package com.pragim.hibernatecrud.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pragim.hibernatecrud.model.Product;

public class DeleteClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Product pro = (Product) session.get(Product.class, 10001);
		// System.out.println(pro);
		if (pro != null) {
			session.delete(pro);

		}
		tx.commit();

	}

}

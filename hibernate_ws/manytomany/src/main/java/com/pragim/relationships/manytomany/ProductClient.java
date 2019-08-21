package com.pragim.relationships.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pragim.relationships.manytomany.entity.Product;

public class ProductClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	Session session = factory.openSession();
    	
    	
    	Product product = (Product)session.get(Product.class, 1);
    	System.out.println(product.getProId()+" "+product.getProName()+" "+product.getPrize());
    	
    	
    	session.close();
    	
    	try {
			Thread.sleep(4000);
			System.out.println("thread is sleeping");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	Session session2 = factory.openSession();
    	Product product1 = (Product)session2.get(Product.class, 1);
    	System.out.println(product1.getProId()+" "+product1.getProName()+" "+product1.getPrize());
    	session2.close();
    	factory.close();
	}

}

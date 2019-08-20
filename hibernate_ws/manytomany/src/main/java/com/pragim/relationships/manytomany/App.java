package com.pragim.relationships.manytomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pragim.relationships.manytomany.entity.Product;
import com.pragim.relationships.manytomany.entity.Seller;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	Session session = factory.openSession();
    	
    	
    	
    	
    
    	
    	//seller list
    	
    	Set<Seller> sellerList = new HashSet<Seller>();
    	
    	Seller sel1 = new Seller();
    	sel1.setSellerName("WS");
    	sel1.setLocation("bangl");
    	
    	Seller sel2 = new Seller();
    	sel2.setSellerName("PMS");
    	sel2.setLocation("bangl");
    	
    	sellerList.add(sel1);
    	sellerList.add(sel2);
    	
    	//prepare product data
    	
    	Product prod = new Product();
    	prod.setProName("Dell");
    	prod.setPrize(50000);
    	prod.setSellerList(sellerList);
    	
    	Transaction beginTransaction = session.beginTransaction();
    	session.save(prod);
    	beginTransaction.commit();
    	System.out.println("===========Many to many Save============");
    	
    	session.close();
    	factory.close();
    	
    }
}

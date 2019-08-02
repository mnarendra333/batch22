package com.pragim.hibfirstappwithmaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pragim.hibfirstappwithmaven.model.Airlines;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
    	
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	
    	
    	Airlines al = new Airlines();
    //	al.setId(13453);
    	al.setName("AirAsia");
    	al.setCapacity(200);
    	al.setType("airBus");
    	
    	session.save(al);
    	
    	session.beginTransaction().commit();
    	System.out.println("Airlines object saved!!!!");
    	
    }
}

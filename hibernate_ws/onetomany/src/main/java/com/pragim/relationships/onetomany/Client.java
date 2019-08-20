package com.pragim.relationships.onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pragim.relationships.onetomany.entity.Customer;
import com.pragim.relationships.onetomany.entity.Vendor;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		//preant
		
		Vendor vendor = new Vendor();
		vendor.setVenId(3);
		vendor.setVenName("CTS");
		vendor.setAddress("bangl");
	
		
		//prepare customer list
		
		Customer c1 = new Customer();
		c1.setCustId(1030);
		c1.setCustName("emc2");
		
		Customer c2 = new Customer();
		c2.setCustId(1031);
		c2.setCustName("mindtree");
		
		Customer c3 = new Customer();
		c3.setCustId(1032);
		c3.setCustName("redhat");
		
		//create collection to hold many customers
		Set<Customer> custList = new HashSet<Customer>();
		custList.add(c1);
		custList.add(c2);
		custList.add(c3);
		
		
		vendor.setCustomerList(custList);
		
		//save the parent
		session.save(vendor);
		session.beginTransaction().commit();
		
		session.close();
		factory.close();
		
	}

}

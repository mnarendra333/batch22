package com.pragim.relationships.onetomany;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pragim.relationships.onetomany.entity.Customer;
import com.pragim.relationships.onetomany.entity.Vendor;

public class UpdateCustomerClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		
		  Vendor vendor = (Vendor)session.get(Vendor.class, 1);
		  System.out.println("vendor information");
		  System.out.println(vendor.getVenName()+" "+vendor.getAddress());
		 
		
		/*
		 * Query query =
		 * session.createQuery("select c from Customer c where c.custName=:custName");
		 * List<Customer> list = query.setString("custName", "jio").list();
		 * if(list!=null && !list.isEmpty()) { Customer customer = list.get(0);
		 * session.delete(customer); } session.beginTransaction().commit();
		 */
		//vendor.getC
		
		  Set<Customer> customerList = vendor.getCustomerList();
		  Iterator<Customer> iterator = customerList.iterator();
		  while(iterator.hasNext()) {
			  
			  Customer cust = iterator.next();
			  if("Yahoo".equalsIgnoreCase(cust.getCustName())) {
				  // update other prop
			  }
				 // cust.setAddress("mumbai");
			  
		  }
		  
		  session.beginTransaction().commit();
		
		
	}

}

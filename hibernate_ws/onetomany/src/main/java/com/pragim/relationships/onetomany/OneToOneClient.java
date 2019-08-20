package com.pragim.relationships.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pragim.relationships.onetomany.entity.Address;
import com.pragim.relationships.onetomany.entity.Customer;

public class OneToOneClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Customer customer  = (Customer)session.get(Customer.class, 1031);
		
		Address addr = new Address();
		addr.setStreet("BaghmaneZone");
		addr.setState("Karnataka");
		addr.setCity("bangl");
		addr.setPincode(560037);
		
		if(customer!=null)
			customer.setAddress(addr);
		
		session.update(customer);
		session.beginTransaction().commit();

	}

}

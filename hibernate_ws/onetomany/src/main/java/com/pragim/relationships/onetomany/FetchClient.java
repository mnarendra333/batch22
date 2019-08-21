package com.pragim.relationships.onetomany;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pragim.relationships.onetomany.entity.Customer;
import com.pragim.relationships.onetomany.entity.Vendor;

public class FetchClient {
	
	public static void main(String[] args) {
		
		
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		
		List<Vendor> list = session.createQuery("from Vendor v").list();
		list.forEach(vendor->{
			System.out.println(vendor.getVenId()+" "+vendor.getVenName());
			Set<Customer> customerList = vendor.getCustomerList();
			customerList.forEach(customer->{
				System.out.println(customer.getCustId()+" "+customer.getCustName()+" "+customer.getAddress());
			});
		});
		
		
		
		session.close();
		factory.close();
	}

}

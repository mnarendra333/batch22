package com.pragim.relationships.onetomany;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pragim.relationships.onetomany.entity.Customer;
import com.pragim.relationships.onetomany.entity.Vendor;
import com.pragim.relationships.onetomany.util.HibUtility;

public class AddNewCustomerClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		
		Customer newobj = new Customer();
		newobj.setCustId(1005);
		newobj.setCustName("Yahoo");
		newobj.setAddress("bangl");
		
		
		Vendor vendor = (Vendor)session.get(Vendor.class, 1);
		System.out.println("vendor information");
		System.out.println(vendor.getVenName()+" "+vendor.getAddress());
		
		Set<Customer> customerList = vendor.getCustomerList();
		
		customerList.forEach(item->System.out.println(item));
		
		customerList.add(newobj);
		vendor.setCustomerList(customerList);
		session.save(vendor);
		session.beginTransaction().commit();
		
		HibUtility.closeConnections(session, factory);
		

	}

}

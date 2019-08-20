package com.pragim.relationships.onetomany;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pragim.relationships.onetomany.entity.Address;
import com.pragim.relationships.onetomany.entity.Customer;
import com.pragim.relationships.onetomany.entity.Vendor;
import com.pragim.relationships.onetomany.util.HibUtility;

public class AddNewCustomerClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		
		Customer newobj = new Customer();
		newobj.setCustId(1007);
		newobj.setCustName("GI");
		//newobj.setAddress("bangl");
		
		Address addr = new Address();
		addr.setStreet("EcoSpace");
		addr.setState("UP");
		addr.setCity("bangl");
		addr.setPincode(560037);
		
		newobj.setAddress(addr);
		
		Vendor vendor = (Vendor)session.get(Vendor.class, 25);
		System.out.println("vendor information");
		System.out.println(vendor.getVenName()+" "+vendor.getAddress());
		
		Set<Customer> customerList = vendor.getCustomerList();
		
		customerList.forEach(item->System.out.println(item));
		
		customerList.add(newobj);
		vendor.setCustomerList(customerList);// its for update the custom,er lost to the existing value 
		session.save(vendor);
		session.beginTransaction().commit();
		
		HibUtility.closeConnections(session, factory);
		

	}

}

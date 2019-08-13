package com.pragim.relationships.onetomany;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pragim.relationships.onetomany.entity.Customer;
import com.pragim.relationships.onetomany.entity.Vendor;

public class RemoveCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Vendor vendor = (Vendor)session.get(Vendor.class, 1);
		
		Set<Customer> customerList = vendor.getCustomerList();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer name");
		String customerName = sc.next();
		
		Iterator<Customer> iterator = customerList.iterator();
		while(iterator.hasNext()) {
			Customer cobj = iterator.next();
			if(customerName.equalsIgnoreCase(cobj.getCustName()))
				iterator.remove();
		}
		
		session.beginTransaction().commit();
		
		session.close();
		factory.close();

	}

}

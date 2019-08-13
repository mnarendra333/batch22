package com.pragim.relationships.onetomany.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibUtility {
	
	
	
	
	public static void closeConnections(Session session, SessionFactory factory){
		session.close();
		factory.close();
	}

}

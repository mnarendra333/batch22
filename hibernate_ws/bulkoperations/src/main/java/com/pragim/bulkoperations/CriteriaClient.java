package com.pragim.bulkoperations;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.pragim.bulkoperations.model.College;

public class CriteriaClient {
	
	
	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		
		Criteria crit = session.createCriteria(College.class);
		List<College> list = crit.list();
		list.forEach(item->System.out.println(item));
		
		
		//partial object selection
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.property("name"));
		projectionList.add(Projections.property("address"));
		
		crit.setProjection(projectionList);
		List<Object[]> obj= crit.list();
		obj.forEach(item->System.out.println(item[0]+" "+item[1]));
		
		//single prop
		crit.setProjection(Projections.property("name"));
		List<String> colNames = crit.list();
		colNames.forEach(System.out::println);
		//Restrictions.
		
		
	}

}

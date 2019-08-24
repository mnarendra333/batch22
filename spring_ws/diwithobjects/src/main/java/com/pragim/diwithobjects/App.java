package com.pragim.diwithobjects;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pragim.diwithobjects.model.Traveller;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
//    	Resource resource = new ClassPathResource("spring.xml");
//    	BeanFactory factory = new XmlBeanFactory(resource);
    	
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    	Traveller traveller = ctx.getBean("id1",Traveller.class);
    	traveller.startJourney();
    	
    	
    }
}

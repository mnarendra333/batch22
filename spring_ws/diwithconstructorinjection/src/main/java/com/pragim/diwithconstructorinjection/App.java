package com.pragim.diwithconstructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pragim.diwithconstructorinjection.model.Person;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
	
	
	
	
	
	
    public static void main( String[] args )
    {
       
		/*
		 * ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		 * Person person = ctx.getBean("id1",Person.class); person.getCources();
		 */
    	
    	
    	
    	String s1 = "Today is a holiday";
    	String[] split = s1.split(" ");
    	for (String string : split) {
			System.out.println(string);
		}
    	
    }
}

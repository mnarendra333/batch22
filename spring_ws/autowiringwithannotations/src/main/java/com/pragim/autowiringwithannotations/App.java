package com.pragim.autowiringwithannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pragim.autowiringwithannotations.model.Computer;
import com.pragim.autowiringwithannotations.model.Person;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
	
		//Computer person = ctx.getBean("id2", Computer.class);
		//person.startMachine();
		
		Person person = ctx.getBean("person", Person.class);
		person.doWork();

	}
}

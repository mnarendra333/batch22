package com.pragim.autowiringwithannotations.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Autowired
	private Computer com;
	
	
	public Person(Computer computer) {
		super();
		System.out.println("inside constructor");
		this.com = computer;
	}

	

	public void doWork() {
		com.startMachine();
	}

	

}

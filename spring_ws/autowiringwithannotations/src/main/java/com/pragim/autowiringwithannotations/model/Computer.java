package com.pragim.autowiringwithannotations.model;

import org.springframework.stereotype.Component;
@Component
public class Computer {
	
	
	public Computer() {
		System.out.println("===dc===");
	}
	
	public void startMachine() {
		System.out.println("device started");
	}
	
	public void stopMachine() {
		System.out.println("device stopped");
	}

}

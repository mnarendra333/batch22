package com.pragim.autowiring.model;

public class Person {

	private Computer computer;
	
//	public Person(Computer computer) {
//		super();
//		this.computer = computer;
//	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	public void doWork() {
		computer.startMachine();
	}

	

}

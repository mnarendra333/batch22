package com.pragim.diwithobjects.model;

public class Flight implements Vehicle {

	@Override
	public void start() {
		System.out.println("Travelling on Flight=== Flight started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Flight Stopped");
	}

}

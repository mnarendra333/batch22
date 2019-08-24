package com.pragim.diwithobjects.model;

public class Bus implements Vehicle {

	private String serviceNo;
	private String driverName;
	
	
	public void setServiceNo(String serviceNo) {
		this.serviceNo = serviceNo;
	}
	
	
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}


	@Override
	public void start() {
		System.out.println("travelling on Bus!! ..Bus started!!");
		System.out.println("serviceNo :: "+serviceNo);
		System.out.println("DriverName :: "+driverName);
	}

	@Override
	public void stop() {
		System.out.println("Bus stopped");
	}

}

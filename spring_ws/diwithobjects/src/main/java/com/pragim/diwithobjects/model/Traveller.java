package com.pragim.diwithobjects.model;

public class Traveller {
	
	private Vehicle vehicle;
	
		public void setVehicle(Vehicle vehicle) {
			this.vehicle = vehicle;
		}
	
		public void startJourney() {
			vehicle.start();
			
			System.out.println("=======================");
			
			vehicle.stop();
		}

}

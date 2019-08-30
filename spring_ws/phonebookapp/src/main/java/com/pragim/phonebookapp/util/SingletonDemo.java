package com.pragim.phonebookapp.util;

public class SingletonDemo {
	
	
	private static SingletonDemo  obj = null;
	
	private SingletonDemo() {
		
	}
	
	
	public static SingletonDemo getInstance() {
		
		if(obj == null)
			obj = new SingletonDemo();
		
		return obj;
	}
	
	
	
	
	
	

}

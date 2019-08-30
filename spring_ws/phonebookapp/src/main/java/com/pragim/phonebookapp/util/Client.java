package com.pragim.phonebookapp.util;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SingletonDemo instance1 = SingletonDemo.getInstance();
		
		SingletonDemo instance2 = SingletonDemo.getInstance();
		
		
		System.out.println(instance1.hashCode()+" "+instance2.hashCode());
	}

}

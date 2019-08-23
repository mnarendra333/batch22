package com.pragim.springfirstapp.beans;

public class HelloWorldBean {
	
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	public void showMessage() {
		System.out.println("message :: "+message);
	}
	
	

}

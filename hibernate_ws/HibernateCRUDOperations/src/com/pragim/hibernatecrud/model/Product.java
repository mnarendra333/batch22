package com.pragim.hibernatecrud.model;

public class Product {

	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", price=" + price + "]";
	}

	private int proId;
	private String proName;
	private double price;

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

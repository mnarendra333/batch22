package com.pragim.shoppingcartappusingspringrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shopping_cart")
public class Product {

	@Id
	private int id;
	@Column(name="PRO_NAME")
	private String name;
	
	private double price;
	@Column(length=20)
	private String seller;
	@Column(name="MANUFAC",length=20)
	private String manufacturer;
	@Column(name="PRO_TYPE",length=20)
	private String proType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getProType() {
		return proType;
	}

	public void setProType(String proType) {
		this.proType = proType;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", seller=" + seller + ", manufacturer="
				+ manufacturer + ", proType=" + proType + "]";
	}
	
	

}

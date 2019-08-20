package com.pragim.relationships.manytomany.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table
public class Seller {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seller_seq")
	@SequenceGenerator(name="seller_seq", sequenceName = "seller_seq",initialValue=10001, allocationSize=1)
	private int selId;
	
	@Column(length=30)
	private String sellerName;
	@Column(length=30)
	private String location;
	
	@ManyToMany(cascade=CascadeType.ALL,targetEntity=Seller.class)
	@JoinTable(name="prod_seller_info",joinColumns= {@JoinColumn(name="selId",nullable=false) },inverseJoinColumns= {@JoinColumn(name="proId",nullable=false)})
	Set<Product> productList;

	public int getSelId() {
		return selId;
	}

	public void setSelId(int selId) {
		this.selId = selId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set<Product> getProductList() {
		return productList;
	}

	public void setProductList(Set<Product> productList) {
		this.productList = productList;
	}

}

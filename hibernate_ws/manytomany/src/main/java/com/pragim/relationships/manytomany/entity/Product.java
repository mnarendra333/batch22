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
@Table(name="product_info")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq")
	@SequenceGenerator(name="product_seq", sequenceName = "product_seq", allocationSize=1)
	private int proId;
	@Column(length=30)
	private String proName;
	private double prize;
	
	
	
	@ManyToMany(cascade=CascadeType.ALL,targetEntity=Seller.class)
	@JoinTable(name="prod_seller_info",joinColumns= {@JoinColumn(name="proId",nullable=false) },inverseJoinColumns= {@JoinColumn(name="selId",nullable=false)})
	private Set<Seller> sellerList;

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

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}
	
	

	public Set<Seller> getSellerList() {
		return sellerList;
	}

	public void setSellerList(Set<Seller> sellerList) {
		this.sellerList = sellerList;
	}

	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", prize=" + prize + "]";
	}

}

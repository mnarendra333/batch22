package com.pragim.relationships.onetomany.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table
public class Vendor {

	@Id
	@Column
	@GeneratedValue
	private int venId;

	@Column(length = 20)
	private String venName;
	@Column(length = 30)
	private String address;

	@OneToMany(cascade=CascadeType.ALL,targetEntity=Customer.class,orphanRemoval=true)
	@JoinColumn(name="vendor_id")
	@Fetch(value=FetchMode.SUBSELECT)
	private Set<Customer> customerList;

	public int getVenId() {
		return venId;
	}

	public void setVenId(int venId) {
		this.venId = venId;
	}

	public String getVenName() {
		return venName;
	}

	public void setVenName(String venName) {
		this.venName = venName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(Set<Customer> customerList) {
		this.customerList = customerList;
	}

	@Override
	public String toString() {
		return "Vendor [venId=" + venId + ", venName=" + venName + ", address=" + address + "]";
	}

}

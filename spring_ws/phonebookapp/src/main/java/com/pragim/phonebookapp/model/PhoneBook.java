package com.pragim.phonebookapp.model;

public class PhoneBook {

	private int id;
	private String name;
	private String phoneNo;
	private String provider;

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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	@Override
	public String toString() {
		return "PhoneBook [name=" + name + ", phoneNo=" + phoneNo + ", provider=" + provider + "]";
	}

}

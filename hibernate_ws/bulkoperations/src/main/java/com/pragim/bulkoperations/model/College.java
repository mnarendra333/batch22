package com.pragim.bulkoperations.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="college_tab")
public class College {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="col_id")
	private int id;
	
	@Column(name="col_name",length=30,nullable=false)
	private String name;
	
	@Column(name="addr", length=30)
	private String address;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	

}

package com.restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	@Column
	private String name;
	@Column
	private String address;
	@Column
	private Double sallary;
	
	public User() {
		
	}

	public User(Integer id, String name, String address, Double sallary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.sallary = sallary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Double getSallary() {
		return sallary;
	}

	public void setSallary(Double sallary) {
		this.sallary = sallary;
	}
	
	
	
	

}

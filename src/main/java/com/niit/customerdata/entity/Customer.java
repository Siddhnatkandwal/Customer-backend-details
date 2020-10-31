package com.niit.customerdata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {

	@Id
	@GeneratedValue
	@Column
	private int id;

	@Column
	private String name;

	@Column
	private long number;

	@Column
	private String email;

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

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", number=" + number + ", email=" + email + "]";
	}

	public Customer(int id, String name, long number, String email) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.email = email;
	}

	public Customer() {
		super();
	}

}

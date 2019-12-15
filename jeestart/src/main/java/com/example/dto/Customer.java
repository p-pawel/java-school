package com.example.dto;

public class Customer {
	private long id;
	private String name;

	public Customer(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}

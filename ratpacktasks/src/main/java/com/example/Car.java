package com.example;

class Car {
	private int id = 1;
	private String name = "Fiat";

	public int getId() {
		return id;
	}

	public Car setId(int id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Car setName(String name) {
		this.name = name;
		return this;
	}
}

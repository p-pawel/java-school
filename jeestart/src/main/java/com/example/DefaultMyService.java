package com.example;

public class DefaultMyService implements MyService {

	@Override
	public String getHello() {
		return "hello";
	}

	@Override
	public String getGreeting(String name) {
		return "Hello " + name;
	}

}

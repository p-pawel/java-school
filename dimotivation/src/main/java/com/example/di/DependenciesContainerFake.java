package com.example.di;

import com.example.payment.MockProviderService;
import com.example.payment.PaymentService;

import java.util.HashMap;
import java.util.Map;

public class DependenciesContainerFake implements DependenciesContainer {

	Map<Class, Object> beans = new HashMap<>();

	public DependenciesContainerFake() {
		add(PaymentService.class, new MockProviderService());
	}

	public void add(Class clazz, Object object) {
		beans.put(clazz, object);
	}

	@Override
	public <T> T get(Class<T> clazz) {
		return (T) beans.get(clazz);
	}
}

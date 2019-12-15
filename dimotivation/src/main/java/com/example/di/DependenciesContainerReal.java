package com.example.di;

import com.example.DefaultBillingService;
import com.example.payment.MockProviderService;
import com.example.payment.PaymentProviderService;
import com.example.payment.PaymentService;

import java.util.HashMap;
import java.util.Map;

public class DependenciesContainerReal implements DependenciesContainer {

	Map<Class, Object> beans = new HashMap<>();

	public DependenciesContainerReal() {
		beans.put(PaymentService.class, new PaymentProviderService());
		beans.put(DefaultBillingService.class, new DefaultBillingService());
		beans.put(String.class, "p@assword");
	}

	@Override
	public <T> T get(Class<T> clazz) {
		return (T) beans.get(clazz);
	}
}

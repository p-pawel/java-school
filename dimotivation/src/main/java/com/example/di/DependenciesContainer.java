package com.example.di;

import com.example.payment.PaymentService;

import java.util.Map;

public interface DependenciesContainer {
	<T> T get(Class<T> clazz);
}

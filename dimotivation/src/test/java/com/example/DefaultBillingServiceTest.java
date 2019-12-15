package com.example;


import com.example.di.DependenciesContainer;
import com.example.di.DependenciesContainerFake;
import com.example.di.DependencyConfig;
import com.example.dto.Bill;
import com.example.dto.CreditCard;
import com.example.dto.Order;
import com.example.payment.MockProviderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class DefaultBillingServiceTest {

	private DefaultBillingService defaultBillingService = new DefaultBillingService();

	@BeforeAll
	static void setUp() {
		DependencyConfig.setDependenciesContainer(new DependenciesContainerFake());
	}

	@Test
	void name() {

		// given
		Order order = new Order();
		order.setValue(new BigDecimal("30.00"));

//		defaultBillingService.setPaymentProviderService(new MockProviderService());
		CreditCard creditCard = new CreditCard("4111111111111111");

		// when
		Bill bill = defaultBillingService.chargeOrder(order, creditCard);

		// then
		Assertions.assertEquals(BigDecimal.ZERO, bill.getDue());
	}
}
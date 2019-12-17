package com.example.payment;

import com.example.dto.CreditCard;

import java.math.BigDecimal;

public class MockProviderService implements PaymentService {

	public MockProviderService() {
		System.out.println("Spokojnie, to tylko fake provider");
	}

	@Override
	public void charge(CreditCard creditCard, BigDecimal value) throws PaymentException {
		System.out.println("Udaję, że się łączę i akceptuję kwotę " + value);
	}
}

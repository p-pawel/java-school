package com.example.payment;

import com.example.dto.CreditCard;

import java.math.BigDecimal;

public class PaymentProviderService implements PaymentService {

	public PaymentProviderService() {
		System.out.println("Nawiązuję połączenie z prawdziwym dostawcą płatności");
	}

	@Override
	public void charge(CreditCard creditCard, BigDecimal value) throws PaymentException {
		System.out.println("Tu się łączę i pobieram kwotę " + value);
	}
}

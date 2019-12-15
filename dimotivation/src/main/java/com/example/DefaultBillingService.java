package com.example;

import com.example.di.DependenciesContainer;
import com.example.di.DependencyConfig;
import com.example.dto.Bill;
import com.example.dto.CreditCard;
import com.example.dto.Order;
import com.example.payment.PaymentException;
import com.example.payment.PaymentService;

import java.math.BigDecimal;

public class DefaultBillingService implements BillingService {

	PaymentService paymentProviderService;

	public DefaultBillingService setPaymentProviderService(PaymentService paymentProviderService) {
		this.paymentProviderService = paymentProviderService;
		return this;
	}

	public Bill chargeOrder(Order order, CreditCard creditCard) {

		try {
			getPaymentProviderService().charge(creditCard, order.getValue());

			return new Bill(BigDecimal.ZERO);

		} catch (PaymentException e) {
			System.out.println("Błąd");

			return new Bill(order.getValue());
		}

	}

	private PaymentService getPaymentProviderService() {
		return DependencyConfig.getDependenciesContainer().get(PaymentService.class);
	}
}

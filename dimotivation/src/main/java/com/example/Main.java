package com.example;

import com.example.billing.ConcreteBillingService;
import com.example.di.DependenciesContainerReal;
import com.example.di.DependencyConfig;
import com.example.dto.Bill;
import com.example.dto.CreditCard;
import com.example.dto.Order;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {

		DependencyConfig.setDependenciesContainer(new DependenciesContainerReal());

		chargeOrder(new BigDecimal(30), "asdf");   // argumenty z konsoli
	}

	private static void chargeOrder(BigDecimal amount, String cardNumber) {
		Order order = new Order();
		order.setValue(amount);

		CreditCard creditCard = new CreditCard(cardNumber);

		ConcreteBillingService concreteBillingService = new ConcreteBillingService();

		Bill bill = concreteBillingService.chargeOrder(order, creditCard);

		System.out.println("Pozostało do zapłaty: " + bill.getDue());
	}
}

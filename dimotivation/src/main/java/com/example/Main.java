package com.example;

import com.example.di.DependenciesContainer;
import com.example.di.DependenciesContainerReal;
import com.example.di.DependencyConfig;
import com.example.dto.Bill;
import com.example.dto.CreditCard;
import com.example.dto.Order;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {

		DependencyConfig.setDependenciesContainer(new DependenciesContainerReal());


		/////

		chargeOrder(new BigDecimal(args[0]), args[1]);
	}

	private static void chargeOrder(BigDecimal amount, String cardNumber) {
		Order order = new Order();
		order.setValue(amount);

		CreditCard creditCard = new CreditCard(cardNumber);

		DefaultBillingService defaultBillingService = new DefaultBillingService();

		Bill bill = defaultBillingService.chargeOrder(order, creditCard);

		System.out.println("Pozostało do zapłaty: " + bill.getDue());
	}
}

package com.example;

import java.util.Scanner;

public class OrderFactory {

	public OrderTO createOrder() {
		OrderTO orderTO = new OrderTO();

		Scanner in = new Scanner(System.in);

		System.out.println("Id produktu: ");
		orderTO.setProductId(in.nextInt());

		System.out.println("Id klienta: ");
		orderTO.setClientId(in.nextInt());

		System.out.println("Sztuk: ");
		orderTO.setQty(in.nextInt());
		return orderTO;
	}

}

package com.example.billing;

import com.example.di.DependencyConfig;
import com.example.dto.Bill;
import com.example.dto.CreditCard;
import com.example.dto.Order;
import com.example.payment.PaymentException;
import com.example.payment.PaymentService;

import java.math.BigDecimal;

public class ConcreteBillingService implements BillingService {

    public Bill chargeOrder(Order order, CreditCard creditCard) {

        try {
            getPaymentProviderService().charge(creditCard, order.getValue());  // w tym miejscu sięgamy do statycznego kontenera zależności
            return new Bill(BigDecimal.ZERO);
        } catch (PaymentException e) {
            System.out.println("Błąd");
            return new Bill(order.getValue());
        }
    }

    private PaymentService getPaymentProviderService() {
        return DependencyConfig.getDependenciesContainer().get(PaymentService.class);  //prosimy o obiekt klasy PaymentService za pomocą metody generycznej get()
    }
}

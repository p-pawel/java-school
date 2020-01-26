package com.example.billing;

import com.example.dto.Bill;
import com.example.dto.CreditCard;
import com.example.dto.Order;

public interface BillingService {

	Bill chargeOrder(Order order, CreditCard creditCard);
}

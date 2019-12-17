package com.example.payment;

import com.example.dto.CreditCard;

import java.math.BigDecimal;

public interface PaymentService {

	void charge(CreditCard creditCard, BigDecimal value) throws PaymentException;

}



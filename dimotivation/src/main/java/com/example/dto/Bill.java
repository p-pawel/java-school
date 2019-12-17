package com.example.dto;

import java.math.BigDecimal;

public class Bill {
	private BigDecimal due;

	public Bill(BigDecimal due) {
		this.due = due;
	}

	public BigDecimal getDue() {
		return due;
	}

	public Bill setDue(BigDecimal due) {
		this.due = due;
		return this;
	}
}

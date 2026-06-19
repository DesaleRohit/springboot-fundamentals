package com.rohit.beans;

import org.springframework.stereotype.Component;

@Component
public class CardPaymentService implements PaymentService {
	@Override
	public void makePayment() {
		System.out.println("Payment done using Card");
	}
}

package com.rohit.beans;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

	private PaymentService paymentService;

	public OrderService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public void placeOrder() {
		System.out.println("Order Created");
		paymentService.makePayment();
		System.out.println("Order Confirmed");
	}
}

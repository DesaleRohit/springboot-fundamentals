package com.rohit.beans;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String city;
	private String state;

	public Address() {
		this.city = "Pune";
		this.state = "Maharashtra";
	}

	public void displayAddress() {
		System.out.println("City : " + city);
		System.out.println("State : " + state);
	}
}

package com.rohit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private int id;
	private String name;

	private Address address;

	public Student() {
		id = 101;
		name = "Ganesh";
	}

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public void displayStudent() {

		System.out.println("Student Id : " + id);
		System.out.println("Student Name : " + name);

		System.out.println("\nAddress Details");

		address.displayAddress();
	}

}

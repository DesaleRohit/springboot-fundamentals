package com.rohit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rohit.beans.Address;
import com.rohit.beans.Student;
import com.rohit.resources.JavaConfig;

public class Main {

	public static void main(String[] args) {

		// Create Spring IoC Container
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		// Get Student bean from the container
		Student student = context.getBean(Student.class);

		// Set Student data
		student.setId(101);
		student.setName("Ganesh");

		// Get Address bean from the container
		Address address = context.getBean(Address.class);

		// Set Address data
		address.setCity("Pune");
		address.setState("Maharashtra");

		// Print Student object
		System.out.println(student);
	}
}
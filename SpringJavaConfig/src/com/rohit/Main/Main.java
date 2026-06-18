package com.rohit.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rohit.beans.Students;
import com.rohit.resources.SpringConfig;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Students std = (Students) context.getBean("stdId1");
		System.out.println(std.toString());
		
	}
}

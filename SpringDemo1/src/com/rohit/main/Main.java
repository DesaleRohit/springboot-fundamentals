package com.rohit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohit.beans.Students;

public class Main {

	public static void main(String[] args) {
		String path = "/com/rohit/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);

		Students std1 = (Students) context.getBean("stdId1");
		std1.display();
		System.out.println("-------------------");
		Students std2 = (Students) context.getBean("stdId2");
		std2.display();
	}

}

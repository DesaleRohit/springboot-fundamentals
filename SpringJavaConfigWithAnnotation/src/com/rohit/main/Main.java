package com.rohit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rohit.beans.Course;
import com.rohit.resources.JavaConfigFile;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);
		
		Course c = context.getBean(Course.class);
		System.out.println(c.toString());
	}

}

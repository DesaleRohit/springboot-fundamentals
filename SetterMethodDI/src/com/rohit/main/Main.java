package com.rohit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rohit.beans.Student;
import com.rohit.resources.JavaConfig;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		Student student = context.getBean(Student.class);

		student.displayStudent();

	}

}
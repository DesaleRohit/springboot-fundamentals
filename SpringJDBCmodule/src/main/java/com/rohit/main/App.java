package com.rohit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.rohit.resources.JavaConfig;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		String name = "Gagan";
		String course = "SpringBoot";
		String city = "Pune";

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

		String query = "insert into user values(?,?,?)";

		int count = jdbcTemplate.update(query, name, course, city);

		if (count > 0) {
			System.out.println("Data inserted");
		} else {
			System.out.println("Process failed");
		}

	}
}

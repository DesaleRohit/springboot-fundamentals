package com.rohit.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.rohit.model.User;
import com.rohit.model.UserRowMapper;
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

//		Insert operation

//		String query = "insert into user values(?,?,?)";
//
//		int count = jdbcTemplate.update(query, name, course, city);
//
//		if (count > 0) {
//			System.out.println("Data inserted");
//		} else {
//			System.out.println("Process failed");
//		}

//		Delete Operation

//		String city1 = "Pune";
//
//		String queryDelete = "delete from user where city = ?";
//
//		int count = jdbcTemplate.update(queryDelete, city1);
//
//		if (count > 0) {
//			System.out.println("Value deleted");
//		} else {
//			System.out.println("Process failed");
//		}

//		Update Operation

//		String name2 = "Ramesh";
//		String city3 = "Pune";
//		String queryUpdate = "update user set name = ? where city = ?";
//
//		int count = jdbcTemplate.update(queryUpdate,name2, city3);
//
//		if (count > 0) {
//			System.out.println("Data Updated");
//		} else {
//			System.out.println("Process failed");
//		}

// 		Select Operation

		String querySelect = "select * from user";

		List<User> users = jdbcTemplate.query(querySelect, new UserRowMapper());

		for (User user : users) {
			System.out.println(user);
		}
	}
}

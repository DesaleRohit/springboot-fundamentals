package com.rohit.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rohit.beans.Students;

@Configuration
public class SpringConfig {
	@Bean
	public Students stdId1() {

		Students std = new Students();
		std.setName("Vijay");
		std.setRollno(105);
		std.setEmail("vijay@gmail.com");
		return std;

	}
}

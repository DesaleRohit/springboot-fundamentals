package com.rohit.model;

public class User {

	private String name;
	private String course;
	private String city;

	public User() {
	}

	public User(String name, String course, String city) {
		this.name = name;
		this.course = course;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", course=" + course + ", city=" + city + "]";
	}
}
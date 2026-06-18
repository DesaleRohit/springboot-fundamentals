package com.rohit.beans;

public class Students {
	private String name;
	private int rollno;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", rollno=" + rollno + ", email=" + email + "]";
	}
	
	
}

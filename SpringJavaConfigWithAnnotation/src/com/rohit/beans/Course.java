package com.rohit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {
	@Value("Spring-core")
	private String courseName;
	@Value("501")
	private int courseId;
	@Value("4500")
	private int courseFees;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(int courseFees) {
		this.courseFees = courseFees;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseId=" + courseId + ", courseFees=" + courseFees + "]";
	}
}

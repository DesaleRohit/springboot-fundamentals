package com.rohit.studentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohit.studentapp.dao.StudentDao;
import com.rohit.studentapp.model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDao dao;

	public int insert(Student student) {
		return dao.insert(student);
	}

	public int update(Student student) {
		return dao.update(student);
	}

	public int delete(int id) {
		return dao.delete(id);
	}

	public Student getStudent(int id) {
		return dao.getStudent(id);
	}

	public List<Student> getAllStudents() {
		return dao.getAllStudents();
	}
}
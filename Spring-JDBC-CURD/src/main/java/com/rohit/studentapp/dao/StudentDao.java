package com.rohit.studentapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rohit.studentapp.model.Student;

@Repository
public class StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// Insert
	public int insert(Student student) {

		String sql = "insert into students(name, course, email) values(?,?,?)";

		return jdbcTemplate.update(sql,
				student.getName(),
				student.getCourse(),
				student.getEmail());
	}

	// Update
	public int update(Student student) {

		String sql = "update students set name=?, course=?, email=? where id=?";

		return jdbcTemplate.update(sql,
				student.getName(),
				student.getCourse(),
				student.getEmail(),
				student.getId());
	}

	// Delete
	public int delete(int id) {

		String sql = "delete from students where id=?";

		return jdbcTemplate.update(sql, id);
	}

	// Select One
	public Student getStudent(int id) {

		String sql = "select * from students where id=?";

		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Student.class), id);
	}

	// Select All
	public List<Student> getAllStudents() {

		String sql = "select * from students";

		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
	}
}
package com.rohit.SpringBootJDBC;

import com.rohit.SpringBootJDBC.model.Student;
import com.rohit.SpringBootJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootJdbcApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);
        Student s = context.getBean(Student.class);
        s.setRollNo(4);
        s.setName("Naveen");
        s.setMarks("85");

        StudentService studentService = context.getBean(StudentService.class);

        studentService.addStudent(s);

        List<Student> students = studentService.getStudents();
        System.out.println(students);

    }

}

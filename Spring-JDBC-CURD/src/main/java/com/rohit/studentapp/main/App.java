package com.rohit.studentapp.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rohit.studentapp.config.AppConfig;
import com.rohit.studentapp.model.Student;
import com.rohit.studentapp.service.StudentService;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		StudentService service = context.getBean(StudentService.class);

		Scanner sc = new Scanner(System.in);

		int choice;

		do {

			System.out.println("\n========== Student Management ==========");
			System.out.println("1. Insert Student");
			System.out.println("2. View Student");
			System.out.println("3. View All Students");
			System.out.println("4. Update Student");
			System.out.println("5. Delete Student");
			System.out.println("6. Exit");
			System.out.print("Enter your choice : ");

			choice = sc.nextInt();

			switch (choice) {

			case 1:

				Student student = new Student();

				sc.nextLine(); // Clear buffer

				System.out.print("Enter Name : ");
				student.setName(sc.nextLine());

				System.out.print("Enter Course : ");
				student.setCourse(sc.nextLine());

				System.out.print("Enter Email : ");
				student.setEmail(sc.nextLine());

				service.insert(student);

				System.out.println("Student Inserted Successfully.");
				break;

			case 2:

				System.out.print("Enter Student ID : ");
				int id = sc.nextInt();

				try {
					Student s = service.getStudent(id);

					System.out.println("\nStudent Details");
					System.out.println("----------------------");
					System.out.println("ID     : " + s.getId());
					System.out.println("Name   : " + s.getName());
					System.out.println("Course : " + s.getCourse());
					System.out.println("Email  : " + s.getEmail());

				} catch (Exception e) {
					System.out.println("Student Not Found.");
				}

				break;

			case 3:

				List<Student> list = service.getAllStudents();

				System.out.println("\n------ Student List ------");

				for (Student st : list) {

					System.out.println("----------------------------");
					System.out.println("ID     : " + st.getId());
					System.out.println("Name   : " + st.getName());
					System.out.println("Course : " + st.getCourse());
					System.out.println("Email  : " + st.getEmail());
				}

				break;

			case 4:

				System.out.print("Enter Student ID : ");
				int updateId = sc.nextInt();
				sc.nextLine();

				try {

					Student updateStudent = service.getStudent(updateId);

					System.out.print("Enter New Name : ");
					updateStudent.setName(sc.nextLine());

					System.out.print("Enter New Course : ");
					updateStudent.setCourse(sc.nextLine());

					System.out.print("Enter New Email : ");
					updateStudent.setEmail(sc.nextLine());

					service.update(updateStudent);

					System.out.println("Student Updated Successfully.");

				} catch (Exception e) {
					System.out.println("Student Not Found.");
				}

				break;

			case 5:

				System.out.print("Enter Student ID : ");
				int deleteId = sc.nextInt();

				service.delete(deleteId);

				System.out.println("Student Deleted Successfully.");

				break;

			case 6:

				System.out.println("Thank You!");
				break;

			default:

				System.out.println("Invalid Choice.");
			}

		} while (choice != 6);

		sc.close();
	}

}
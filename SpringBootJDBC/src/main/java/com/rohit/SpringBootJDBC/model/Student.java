package com.rohit.SpringBootJDBC.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private int rollNo;
    private String name;
    private String marks;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks='" + marks + '\'' +
                '}';
    }
}

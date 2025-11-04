package com.example;

public class Student {

    private Course course;

    public Student(Course course) {   // Constructor Injection
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Student Object Created Successfully!");
        course.showCourse();
    }
}

package com.semanticsquare.basics;

import java.util.ArrayList;
import java.util.List;

public class StudentTestDrive {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
 
		Student student1 = new Student("Joan", "male");

		Student student2 = new Student("Raj", "male");

		Student student3 = new Student("Anita", "female");
		
		list.add(student1);
		list.add(student2);
		list.add(student3); 
		
		for (Student student : list) {
			String name = student.getName();
			String gender = student.getGender();
			printNameAndGender(name, gender);
		}

		// System.out.println("\nStudent.studentCount: " + Student.studentCount);

		student1.updateProfile("John");
//		System.out.println("Updated name of student1: " + student1.getName());
//
//		System.out.println("\nName of student1: " + student1.getName());
//		System.out.println("Name of student2: " + student2.getName());
//		System.out.println("Name of student3: " + student3.getName());

	}

	private static void printNameAndGender(String name, String gender) {
		System.out.println(name + " " + gender);
		
	}

}
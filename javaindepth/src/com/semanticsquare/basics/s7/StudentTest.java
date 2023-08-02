package com.semanticsquare.basics.s7;

public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student("Joan", "male", 18, 223_456_7890L, 3.8, 'B');

		Student student2 = new Student("Raj", "male", 21, 223_456_9999L, 3.4, 'M', true);

		Student student3 = new Student("Anita", "female", 20, 223_456_8888L, 4.0, 'M', true);

		// System.out.println("\nStudent.studentCount: " + Student.studentCount);

		student1.updateProfile("John");
		System.out.println("Updated name of student1: " + student1.name);

		System.out.println("\nName of student1: " + student1.name);
		System.out.println("Name of student2: " + student2.name);
		System.out.println("Name of student3: " + student3.name);

	}

}
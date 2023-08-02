package com.semanticsquare.basics.s7;

public class Student {
	static int studentCount; 
	static int idInitializer = 1000;

	final int id = idInitializer++;
	String name;
	// private String name;
	String gender;
	int age;
	long phone;
	double gpa;
	char degree;

	boolean international;
	double tuitionFees = 12000.0;
	double internationalFees = 5000.0;

	/**
	 * 
	 * 
	 * 
	 * @param newName
	 * @param newGender
	 * @param newAge
	 * @param newPhone
	 * @param newGpa
	 * @param newDegree
	 */
	Student(String newName, String newGender, int newAge, long newPhone, double newGpa, char newDegree) {
		this(newName, newGender, newAge, newPhone, newGpa, newDegree, false);
	}

	Student(String name, String gender, int age, long phone, double gpa, char degree, boolean international) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.gpa = gpa;
		this.degree = degree;
		this.international = international;

		studentCount = studentCount + 1;
		int nextId = id + 1;

		if (international) {
			tuitionFees = tuitionFees + internationalFees;
			// return;
		}

		System.out.println("\nid: " + this.id);
		System.out.println("nextId: " + nextId);
		System.out.println("name: " + this.name);
		System.out.println("gender: " + this.gender);
		System.out.println("age: " + this.age);
		System.out.println("phone: " + this.phone);
		System.out.println("gpa: " + this.gpa);
		System.out.println("degree: " + this.degree);
		System.out.println("tuitionFees: " + tuitionFees);
		System.out.println("studentCount: " + studentCount);
	}

	Student() {
	}

	boolean updateProfile(String name) {
		this.name = name;
		return true;
	}

}
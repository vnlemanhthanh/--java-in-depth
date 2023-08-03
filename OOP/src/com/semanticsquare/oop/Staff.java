package com.semanticsquare.oop;

public class Staff extends User {
	public int id = 2;

	public void printId() {
		System.out.println("id: " + id);
		System.out.println("super.id: " + super.id);
	}

	public Staff() {
		userType = "Staff";
	}
	
	public void displayUserInfo() {
		System.out.println("\nPrinting User Info: ");
		System.out.println("id: " + id);
		System.out.println("userType: " + userType);
	}
	
	public void printUserType() {
		System.out.println("Staff");
	}

	public Review postAReview(String reviewText) {
		System.out.println("Staff: postAReview");
		Review review = super.postAReview(reviewText);
		review.setApproved(true);
		return review;
	}

	public void instanceMethod(int d) {
		System.out.println("Staff: instanceMethod");
	}

	public void instanceMethod(Staff d) {
		System.out.println("Staff: instanceMethod");
	}

	//public void finalMethod() {}

	public static void staticMethod() {
		System.out.println("Staff: staticMethod");
	}
}
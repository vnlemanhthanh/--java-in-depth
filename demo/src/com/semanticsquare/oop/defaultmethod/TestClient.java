package com.semanticsquare.oop.defaultmethod;

/**
 * @author Client Inc.
 */
import java.util.*;

public class TestClient { 
	public static String getVal() {
		return TestClient.class.toString(); 
	}

	public static void main(String[] args) {
		// Interfaces demo
		C c = new X();
		/*
		 * c.foo(); c.bar(); c.foobar();
		 */

		// Clone demo
		/*
		 * C clone = ((X)c).clone(); if (clone != c) {
		 * System.out.println("Clone created!!"); }
		 */

		// default method demo
		c.go();
	}
}

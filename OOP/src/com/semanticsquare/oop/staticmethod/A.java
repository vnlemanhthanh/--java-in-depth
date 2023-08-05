package com.semanticsquare.oop.staticmethod;

public interface A {
	String VAL = "A: " + A.class;

	void foo();

	void bar();
	
	default void go() {
	      System.out.println("A: go() - " + this);
	   }
}

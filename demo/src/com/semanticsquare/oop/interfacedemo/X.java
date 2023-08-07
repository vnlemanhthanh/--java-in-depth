package com.semanticsquare.oop.interfacedemo;

public class X extends AbstractA implements A, B {

	public void foo() {
		System.out.println("X: foo()");
		System.out.println("X: VAL: " + B.VAL);
	}




}

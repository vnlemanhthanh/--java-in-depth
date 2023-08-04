package com.semanticsquare.oop.defaultmethod;

/**
 * @author XYZ Inc.
 */
public class X extends AbstractA implements A, B, C, Cloneable {
	public void foo() {
		System.out.println("X: foo()" + this);
		System.out.println("VAL: " + B.VAL);
	}

	public void foobar() {
		System.out.println("X: foobar()" + this);
	}

//	public void go() {
//		System.out.println("X: go() - " + this);
//		C.super.go();
//	}

	public C clone() {
		try {
			return (C) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return null;
	}

}
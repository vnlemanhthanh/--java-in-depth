package com.semanticsquare.oop.staticmethod;

public abstract class AbstractA implements A {
	public void bar() {
		System.out.println("AbstractA: bar() " + this);
	}

//	public void go() {
//		System.out.println("AbstractA: go() - " + this);
//		System.out.println(AbstractA.class.getSimpleName() + " - go() :" + this);
//		
//	}
}
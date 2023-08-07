package com.semanticsquare.oop.abstractdemo;

public abstract class AbstractSubclass extends AbstractSuperclass {

	public AbstractSubclass(int incr1, int incr2) {
		super(incr1, incr2);
	}

	public int foo() {
		System.out.println("foo: " + 10);
		return 10;
	}
}

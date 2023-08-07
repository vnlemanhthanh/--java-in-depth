package com.semanticsquare.oop.abstractdemo;

public class ConcreteSubclass extends AbstractSubclass {

	public ConcreteSubclass(int incr1, int incr2) {
		super(incr1, incr2);
	}

	public int bar() {
		System.out.println("bar: " + 20);
		return 20;
	}

	public static void main(String[] args) {
		AbstractSuperclass concrete = new ConcreteSubclass(1, 2);
		//concrete.foo();
		//concrete.bar();
		concrete.compute();
	}
	
}

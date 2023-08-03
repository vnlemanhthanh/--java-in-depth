package com.semanticsquare.oop.abstractdemo;

public class ConcreteSubclass extends AbstractSubclass {

	public int bar() {
		System.out.println("bar: " + 20);
		return 20;
	}

	public static void main(String[] args) {
		AbstractSuperclass concrete = new ConcreteSubclass();
		//concrete.foo();
		//concrete.bar();
		concrete.compute();
	}
	
}

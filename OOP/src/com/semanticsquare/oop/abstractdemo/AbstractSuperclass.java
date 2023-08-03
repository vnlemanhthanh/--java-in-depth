package com.semanticsquare.oop.abstractdemo;

public abstract class AbstractSuperclass {
	private int incr1 = 1;
	private int incr2 = 2;

	public abstract int foo();
	public abstract int bar();
	
	public int compute() {
		int fooVal = foo();
		if (fooVal > 5) {
			fooVal += incr1;
		}
		
		int barVal = bar();
		if (barVal > 15) {
			barVal += incr2;
		}
		
		int finalVal = fooVal + barVal;
		System.out.println("finalVal: "+ finalVal);
		return finalVal;
	}
}

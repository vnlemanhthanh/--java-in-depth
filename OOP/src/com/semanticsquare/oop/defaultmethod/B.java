package com.semanticsquare.oop.defaultmethod;

public interface B {
	String VAL = TestClient.getVal() + "|" + B.class;

	void foo();

	/*default void go() {
		      System.out.println("B: go() - " + this);
	}*/
}

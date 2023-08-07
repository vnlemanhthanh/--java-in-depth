package com.semanticsquare.oop.staticmethod;

public interface B {
	String VAL = TestClient.getVal() + "|" + B.class;

	void foo();

	/*default void go() {
		      System.out.println("B: go() - " + this);
	}*/
}

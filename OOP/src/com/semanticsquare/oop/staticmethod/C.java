package com.semanticsquare.oop.staticmethod;

/**
 * @author ABC Inc.
 */
public interface C extends A {
   void foobar();
   default void go() {
      System.out.println("C: go() - " + this);
	  staticMethod();
   }
   static void staticMethod() {
      System.out.println("C: staticMethod() -" + C.class);
   }
}

package com.semanticsquare.oop.defaultmethod;

/**
 * @author ABC Inc.
 */
public interface C extends A {
   void foobar();
   
   /**
    * @author ABC Incvcvcc.
    */
   default void go() {
      System.out.println("C: go() - " + this);
   }
}

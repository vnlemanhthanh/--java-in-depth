package com.semanticsquare.oop.staticmethod;

/**
 * @author XYZ Inc.
 */
public class X extends AbstractA implements A, B, C, Cloneable {
   public void foo() {
	   System.out.println(this);
	   System.out.println("X: foo()");
	   System.out.println("VAL: " + B.VAL);
   }
   public void foobar() {
	   System.out.println("X: foobar() -" + this);
   }
   
   public C clone() {
      try {
		 return (C) super.clone();
      } catch(CloneNotSupportedException e) {
	     e.printStackTrace();
	  }
      
	  return null;
   }
   
   public void inheritanceTest() {
      go();
	  //staticMethod();
   }
 
}

package com.semanticsquare.oop.staticmethod;

interface MyInterface {
    default void defaultMethod() {
        System.out.println("This is a default method.");
        privateMethod();
    }
    
    static void staticMethod() {
    	System.out.println("This is a static method.");
        privateStaticMethod();
    }
    
    private void privateMethod() {
        System.out.println("This is a private method.");
    }
    
    private static void privateStaticMethod() {
        System.out.println("This is a private static method.");
    }
}

class MyClass implements MyInterface {
    // Implement other methods or add additional code here
}

public class PrivateMethod {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        
        myObject.defaultMethod();
        
        MyInterface.staticMethod();
    }
}
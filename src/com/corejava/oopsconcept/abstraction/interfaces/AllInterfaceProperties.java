package com.corejava.oopsconcept.abstraction.interfaces;

interface  BasicInterface{

    // All fields in interfaces are: public, static, and final
    int CONST_VALUE = 4;

    // Abstract method (must be implemented by the class)
    void abstractMethod();

    // Default method (allowed from Java 8 onwards)
    default void defaultMethod(){
        System.out.println("Default method in interface");
    }

    // Private method (allowed from Java 9 onwards)
    private void privateHelper(){
        System.out.println("Private helper method in interface");
    }

    // Static method (allowed from Java 8 onwards)
    static void staticMethod(){
        System.out.println("Static method in interface");
    }

    // Private method called from default method
    default void defaultWithPrivateCall() {
        privateHelper();
        System.out.println("Default method calling private method");
    }
}

// From Java 8 onward: interfaces can have default and static methods
interface InterfaceWithDefault {
    default void greet() {
        System.out.println("Hello from InterfaceWithDefault");
    }
}

// From Java 9 onward: interfaces can have private methods (helper methods for reuse)
interface InterfaceWithPrivate {
    private void helper() {
        System.out.println("Private helper from InterfaceWithPrivate");
    }

    default void useHelper() {
        helper(); // private method usage
        System.out.println("Using private helper inside default method");
    }
}

// A class implementing all above interfaces

class InterfaceImplementation implements BasicInterface,InterfaceWithPrivate, InterfaceWithDefault{

    // Must implement abstract method
    @Override
    public void abstractMethod() {
        System.out.println("Implemented abstract method");
    }

    // Can override default method if desired (optional)
    @Override
    public void greet() {
        System.out.println("Overridden greet method from InterfaceWithDefault");
    }

}

// Java 8 onward: Functional Interface support

@FunctionalInterface
interface MyFunctionalInterface{
    void singleMethod(); // Must have exactly one abstract method


    // default and static methods are allowed
    default void helper() {
        System.out.println("Default helper in functional interface");
    }

    static void staticHelper() {
        System.out.println("Static helper in functional interface");
    }


}

public class AllInterfaceProperties {

    public static void main(String[] args) {

        InterfaceImplementation impl1 = new InterfaceImplementation();

        // Accessing implemented abstract method
        impl1.abstractMethod();

        // Accessing default method from interface
        impl1.defaultMethod();

        // Accessing overridden default method
        impl1.greet();


        // Calling private method via default method
        impl1.defaultWithPrivateCall();
        impl1.useHelper();

        // Accessing static method of interface
        BasicInterface.staticMethod();


        // Demonstrating functional interface
        MyFunctionalInterface myFunctionalInterface = ()-> System.out.println("Functional interface using lambda");
        myFunctionalInterface.singleMethod();
        myFunctionalInterface.helper(); // default method
        MyFunctionalInterface.staticHelper(); // static method

        // Accessing constant

        System.out.println( "CONST_VALUE: " + BasicInterface.CONST_VALUE);

    }
}

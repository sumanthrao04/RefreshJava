package com.corejava.oopsconcept.polymorphism.runtimepoly;

// A Java program to illustrate Dynamic Method
// Dispatch using hierarchical inheritance

class Parent{
    void Print() {
        System.out.println("parent class");
    }
}

class subclass1 extends Parent{
    void Print() {
        System.out.println("subclass1");
    }
}

class subclass2 extends Parent {

    // Method
    void Print() {
        System.out.println("subclass2");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        // Creating object of class 1
        Parent a;

        // Now we will be calling print methods
        // inside main() method
        a = new subclass1();
        a.Print();

        a = new subclass2();
        a.Print();

        a=new Parent();
        a.Print();
    }
}

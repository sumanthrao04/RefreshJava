package com.corejava.oopsconcept.polymorphism.runtimepoly;


class A{
    int x= 20;
}

class B extends A{
    int x= 30;
}
public class RuntimePolymorphismWithDataMembers {

    public static void main(String[] args){

        A a= new B();
        System.out.println(a.x);
    }



}

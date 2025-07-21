package com.corejava.oopsconcept.polymorphism.compiletimepoly;
//a. Method overloading by changing the number of parameters

public class MethodOverLoadByParameters {

    public void show(int num1){
        System.out.println("number 1 : " + num1);
    }

    public void show(int num1, int num2){

        System.out.println("number 1 : " + num1 + "  number 2 : " + num2);
    }

    public static void main(String []args){
        MethodOverLoadByParameters m1= new MethodOverLoadByParameters();
        m1.show(5);
        m1.show(4,6);
    }
}

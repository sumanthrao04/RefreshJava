package com.corejava.oopsconcept.polymorphism.compiletimepoly;

//b. Method overloading by changing Datatype of parameter

public class MethodOverLoadByDataType {

    public void show(int num1, int num2){
        System.out.println("This is integer function ");
    }

    public void show(double num1, double num2){
        System.out.println("This is double function ");
    }

    public static void main(String []args){

        MethodOverLoadByDataType D1 = new MethodOverLoadByDataType();
        D1.show(4,5);
        D1.show(4.6,5.6);

    }


}

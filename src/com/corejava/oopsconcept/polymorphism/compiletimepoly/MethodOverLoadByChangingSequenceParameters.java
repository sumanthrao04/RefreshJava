package com.corejava.oopsconcept.polymorphism.compiletimepoly;

//By changing the sequence of parameters
public class MethodOverLoadByChangingSequenceParameters {

    public  void show( int num1, char a){
        System.out.println("integer : " + num1
                + " and character : " + a);
    }

    public void show(char a, int num1){

        System.out.println("character : " + a
                + " and integer : " + num1);
    }

    public static void main(String [] args){
        MethodOverLoadByChangingSequenceParameters m1= new MethodOverLoadByChangingSequenceParameters();
        m1.show('s', 4);
        m1.show(4,'s');
    }
}

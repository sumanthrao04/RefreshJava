package com.corejava.oopsconcept.inheritance;

class one{
    public void one(){
        System.out.println("From parent class or super class ");
    }
}



public class SingleInheritance extends one {

    public void SingleInheritance(){
        System.out.println("From Sub class or child class ");
    }

    public static void main(String[] args){

        SingleInheritance s1= new SingleInheritance();
        s1.one();
        s1.SingleInheritance();
    }
}

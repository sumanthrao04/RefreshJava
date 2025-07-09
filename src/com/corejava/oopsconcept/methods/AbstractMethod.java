package com.corejava.oopsconcept.methods;

abstract class Dog{
   public abstract void sound();
}

public class AbstractMethod extends Dog{
 //Defined in abstract classes or interfaces, implemented by subclasses.
    @Override
    public void sound() {

        System.out.println("The Animal is Barking");
    }


    public static void main(String [] args){
        AbstractMethod abstractMethod = new AbstractMethod();
        abstractMethod.sound();
    }
}

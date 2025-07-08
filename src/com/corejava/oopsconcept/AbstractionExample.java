package com.corejava.oopsconcept;


abstract class Birds{

    abstract void makeSound();
    void breath(){
        System.out.println("Birds are breathings");
    }
}

class Parraot extends Birds{

    @Override
    void makeSound() {
        System.out.println("Parrot is making noise");
    }

}

public class AbstractionExample {

public static void main(String[] args){
    Birds myBirds = new Parraot();
    myBirds.breath();
    myBirds.makeSound();
}
}

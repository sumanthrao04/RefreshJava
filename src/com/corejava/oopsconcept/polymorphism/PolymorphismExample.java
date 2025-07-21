package com.corejava.oopsconcept.polymorphism;

class Person{

    public void role(){
        System.out.println(" Role of a Person");
    }
}

class  Father extends Person{
    @Override
    public void role() {
        System.out.println("Father is the main piller of the house");
    }
}

class Mother extends Person{
    @Override
    public void role() {
        System.out.println("Mother is the Backbone of the house");
    }
}

public class PolymorphismExample {

    public static void main(String[]args){
        Person F1 = new Father();
        Person M1 = new Mother();

        F1.role();
        M1.role();

    }
}

package com.corejava.oopsconcept.constructors;

class Base{

    String name;

    Base(){
        this("");  // Calls the parameterized constructor within Base
        System.out.println("No-argument constructor of" +
                " base class");
    }

    Base(String Name){
        this.name=Name;
        System.out.println("Calling parameterized constructor"
                + " of base : " + Name );
    }
}

public class ConstructorChainingWithSuper extends Base {

    ConstructorChainingWithSuper(){
        System.out.println("No-argument constructor " +
                "of ConstructorChainingWithSuper");
    }

    ConstructorChainingWithSuper(String name){
       // super(name);
        super();
        System.out.println("Calling parameterized " +
                "constructor of ConstructorChainingWithSuper: " + name);

    }

    public static void main(String[]args){
        ConstructorChainingWithSuper c1= new ConstructorChainingWithSuper("Sumanth");
    }

}

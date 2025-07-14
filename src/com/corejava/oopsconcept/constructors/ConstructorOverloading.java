package com.corejava.oopsconcept.constructors;

public class ConstructorOverloading {

    ConstructorOverloading(String name){

        System.out.println("One Argument constructor with String" +name);
    }

    ConstructorOverloading(String name, int age){
        System.out.println("Two Argument constructor" +name +" : " + age);
    }

    ConstructorOverloading(long number){
        System.out.println("One Argument constructor with long number" +number);
    }

    public static void main(String[] args){

        ConstructorOverloading c1= new ConstructorOverloading("sumanth");
        ConstructorOverloading c2= new ConstructorOverloading("sumanth",25);
        ConstructorOverloading c3= new ConstructorOverloading(84310899);

    }
}

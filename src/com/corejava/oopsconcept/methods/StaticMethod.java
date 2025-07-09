package com.corejava.oopsconcept.methods;

public class StaticMethod {
//Belongs to the class, not an object.
    public static String printName(String name){
        return name;
    }

    public static  int printAge(int age){
        return age;
    }

    public static void  main(String [] args){
        System.out.println(StaticMethod.printName("sumanth"));
        System.out.println(StaticMethod.printAge(25));
    }

}

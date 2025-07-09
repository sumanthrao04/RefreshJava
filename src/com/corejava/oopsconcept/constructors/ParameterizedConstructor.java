package com.corejava.oopsconcept.constructors;

public class ParameterizedConstructor {

    String name;
    int id;

    ParameterizedConstructor(String name, int id){
        this.name=name;
        this.id=id;
        System.out.println("object is created through Parameterized Constructor ");

    }

    public ParameterizedConstructor() {
        System.out.println("object is created through default Constructor ");
    }

    public static void main(String[] args){

        ParameterizedConstructor p1 = new ParameterizedConstructor();
        ParameterizedConstructor p2 = new ParameterizedConstructor("Sumanth",1);
        System.out.println(p2.name + " : "  + p2.id);
    }

}

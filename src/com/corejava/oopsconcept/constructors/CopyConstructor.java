package com.corejava.oopsconcept.constructors;

class Geeks{

    String name;
    int id;

    Geeks(String name, int id){
        System.out.println("Calling parameterized Constructor");
        this.name=name;
        this.id=id;


    }

    Geeks(Geeks obj1){
        System.out.println("Calling Copy Constructor ");
        this.name=obj1.name;
        this.id=obj1.id;
    }
}


public class CopyConstructor {


    public static void main(String[] args){

        Geeks c1= new Geeks("sumanth",2);
        System.out.println(" Calling parameterized Constructor : " + c1.id +" : " + c1.name );

        Geeks c2 = new Geeks(c1);
        System.out.println(" Calling copy Constructor : " + c2.id +" : " + c2.name );
    }
}

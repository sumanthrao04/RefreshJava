package com.corejava.oopsconcept;

class Dog{
    String name;
    void bark(){
        System.out.println(name+ " Say's Bow Bow");
    }
}
public class ObjectExample {

    public  static void main(String[] args){
        Dog myDog1=new Dog();
        myDog1.name="Rockey";
        myDog1.bark();

        Dog myDog2= new Dog();
        myDog2.name="Jhoney";
        myDog2.bark();


    }
}

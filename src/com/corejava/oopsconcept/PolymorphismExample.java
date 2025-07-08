package com.corejava.oopsconcept;


class Animal{

    void sound(){
        System.out.println("Animal makes a sound");
    }

    void sound(String type){
        System.out.println("Animal Sound " + type);

    }
        }


  class Cat extends Animal{

     /* @Override
      void sound(){
          System.out.println("cat makes a sound");
      }*/
    void sound(String type){
        System.out.println("Cat is making sound " +type);
    }

  }

public class PolymorphismExample {

    public static  void  main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        Animal poly = new Cat();

        a.sound();
        a.sound("Generic");
        c.sound("loud");
        poly.sound();
    }

}

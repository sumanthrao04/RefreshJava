package com.corejava.oopsconcept;


class Vehicle extends Dog{
    void start(){
        System.out.println("vehicle is starting");
    }

    void stop(){
        System.out.println("vehicle is stopping");
    }
}

class  Car extends Vehicle {
    void honk(){
        System.out.println("Car is honking");
    }
}

public class InheritanceExample {

   public  static void main(String[] args){
       Car mycar = new Car();
       mycar.start();
       mycar.honk();
       mycar.stop();
       mycar.bark();
   }


}

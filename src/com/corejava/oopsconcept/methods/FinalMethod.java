package com.corejava.oopsconcept.methods;

class Car {

    public void startCar(){
        System.out.println(" Starting the car");

    }

    public final  void stopCar(){
        System.out.println(" Stoping the car");
    }
}


public class FinalMethod extends Car{
//Cannot be overridden in subclasses.

    @Override
    public void startCar(){
        System.out.println(" Starting the FinalMethod  car");

    }
    public static void  main(String[] args){
        FinalMethod finalMethod = new FinalMethod();
        finalMethod.startCar();
        finalMethod.stopCar();
    }

}

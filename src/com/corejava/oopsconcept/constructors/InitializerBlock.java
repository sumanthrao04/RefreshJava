package com.corejava.oopsconcept.constructors;

public class InitializerBlock {

    int speed;

    {
        speed=60;
        System.out.println("Speed of the car is set before the object created : " +speed);
    }

    InitializerBlock(){
        System.out.println("Calling no argument constructor to determine the speed : " +speed);
    }

    public static void main(String []args){
        InitializerBlock i1= new InitializerBlock();
        InitializerBlock i2= new InitializerBlock();
    }


}

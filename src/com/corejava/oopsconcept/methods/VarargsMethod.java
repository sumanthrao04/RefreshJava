package com.corejava.oopsconcept.methods;

public class VarargsMethod {
//Accepts variable number of arguments.
    public  static void printName(String... names) {

        for (String name : names) {
            System.out.println(name);
        }

    }
    public  static  void main(String [] args){
        VarargsMethod.printName("sumanth", "Parashuram", "Pradeep");
    }

}

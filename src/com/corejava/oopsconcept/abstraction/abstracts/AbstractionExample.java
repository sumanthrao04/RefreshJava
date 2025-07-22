package com.corejava.oopsconcept.abstraction.abstracts;


 abstract class TvFeatures{

    abstract void turnon();
    abstract void turnoff();

}

class TvRemote extends TvFeatures{

    @Override
    void turnon() {
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnoff() {
        System.out.println("TV is turned OFF.");
    }
}

public class AbstractionExample {

    public static void main(String[]args){

        TvFeatures t1 = new TvRemote();
        t1.turnon();
        t1.turnoff();
    }
}

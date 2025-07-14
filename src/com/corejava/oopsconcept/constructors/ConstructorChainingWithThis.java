package com.corejava.oopsconcept.constructors;

public class ConstructorChainingWithThis {

    ConstructorChainingWithThis(){
        this(4);

        System.out.println(" Default  Constructor");
    }

    ConstructorChainingWithThis(int i){

        this(5,5);
        System.out.println("Parameter Constructor");
    }

    ConstructorChainingWithThis(int x, int y){

        System.out.println("Multiple value : " + x*y);

    }

    public static void  main(String[] args){
        ConstructorChainingWithThis c1 = new ConstructorChainingWithThis();

    }

}

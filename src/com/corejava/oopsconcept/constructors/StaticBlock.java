package com.corejava.oopsconcept.constructors;

public class StaticBlock {

    static  int i;
    int j;
    static {

        i=10;
        System.out.println("static block called before the constructor called");
    }

    StaticBlock(){
        System.out.println("Constructor called");
    }

    public static void main(String []args){
        StaticBlock s1=new StaticBlock();
    }
}
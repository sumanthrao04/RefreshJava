package com.corejava.oopsconcept.inheritance;

class Three{

    public void Threee(){
        System.out.println("Parent class for all classes");
    }
}

class Four extends Three{

    public void Foure(){
        System.out.println("Parent  class for MultilevelInheritance classes and child class  for Three class");
    }
}


public class MultilevelInheritance extends Four {
    public void MultilevelInheritancee(){
        System.out.println("child class for the  Four class and child class  for Three class");
    }

    public static void main(String[] args){

        MultilevelInheritance m1= new MultilevelInheritance();
        m1.Threee();
        m1.Foure();
        m1.MultilevelInheritancee();

    }

}

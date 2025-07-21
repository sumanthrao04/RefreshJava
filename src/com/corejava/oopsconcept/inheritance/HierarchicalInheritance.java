package com.corejava.oopsconcept.inheritance;

class Five{
    public void PrintFive(){
        System.out.println(" The main Super class");
    }
}

class Six extends Five{
    public void PrintSix(){
        System.out.println(" The Child class of SIX");
    }

}

class Seven extends Five{
    public void PrintSeven(){
        System.out.println(" The Child class of Seven");
    }
}


public class HierarchicalInheritance {

    public static void main(String[] args){
        Six s1= new Six();
        s1.PrintSix();
        s1.PrintFive();

       Seven s2= new Seven();
       s2.PrintSeven();
       s2.PrintFive();

    }
}

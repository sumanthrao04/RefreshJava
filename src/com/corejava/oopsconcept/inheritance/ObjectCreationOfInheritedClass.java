package com.corejava.oopsconcept.inheritance;


class Fruit{

    public Fruit(){
        System.out.println("Super class constructor");

        // Displaying object hashcode of super class
        System.out.println("Super class object hashcode :" +
                this.hashCode());

        System.out.println(this.getClass().getName());
    }


}
class Apple extends Fruit{
    public Apple(){
        // Print statement
        System.out.println("Subclass constructor invoked");

        // Displaying object hashcode of sub class
        System.out.println("Sub class object hashcode :" +
                this.hashCode());

        System.out.println(this.hashCode() + " " +
                super.hashCode());

        System.out.println(this.getClass().getName() + " :  " +
                super.getClass().getName());
    }
}

public class ObjectCreationOfInheritedClass  extends Apple{

 public static void main(String[]args){
     ObjectCreationOfInheritedClass ob1 = new ObjectCreationOfInheritedClass();

 }

}

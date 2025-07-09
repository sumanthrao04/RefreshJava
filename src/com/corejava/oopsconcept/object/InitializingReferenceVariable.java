package com.corejava.oopsconcept.object;


class Student{
    int id;
    String name;
}
public class InitializingReferenceVariable {



    public static void main(String[] args){
       // s1 is the reference variable
        Student s1= new Student();
        Student s2= new Student();
        s1.id=1;
        s1.name="Sumanth";
        s2.id=2;
        s2.name="parashuram";

        System.out.println( " The student details " + s1.id + " " + s1.name );
        System.out.println( " The student details " + s2.id + " " + s2.name );

    }

}

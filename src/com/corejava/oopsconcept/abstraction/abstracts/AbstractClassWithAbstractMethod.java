package com.corejava.oopsconcept.abstraction.abstracts;


abstract class EmployeeInfo{

    abstract void employeeInfo();
}

 class Employee extends EmployeeInfo{

     @Override
     void employeeInfo() {
         String name = "sumanth";
         int age = 25;

         System.out.println(name + " : " + age);

     }
 }

public class AbstractClassWithAbstractMethod {

    public static void main(String[] args){
        Employee emp1 = new Employee();
        emp1.employeeInfo();
    }

}

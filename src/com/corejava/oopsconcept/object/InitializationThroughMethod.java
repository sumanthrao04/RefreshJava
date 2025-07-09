package com.corejava.oopsconcept.object;


class Employee{

    int empId;
    String name;

    //Creating a method to insert record
    void insertData(int i, String n){

        empId=i;
        name=n;
    }

    //creating a method to display information
    void displayEmp(){
        System.out.println("Empoyee Id : " +empId + " Empoyee Name : " + name);
    }

}
public class InitializationThroughMethod {

    public  static void main(String[] args){
        Employee emp1= new Employee();
        Employee emp2 = new Employee();

        emp1.insertData(1,"Sumanth");
        emp2.insertData(2,"parashuram");
        emp1.displayEmp();
        emp2.displayEmp();

    }

}

package com.corejava.oopsconcept.methods;

public class InstanceMethod {
//Used for operations on an instance (object) of a class.
    public int add(int a, int b){
        return a+b;
    }

    public int sub(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a , int b){
        return  a/b;
    }

  public  static  void main(String[] args){
 InstanceMethod instanceMethod = new InstanceMethod();
      System.out.println( instanceMethod.add(7,3));
      System.out.println(instanceMethod.sub(5,2));
      System.out.println(instanceMethod.multiply(2, 2));
      System.out.println(instanceMethod.divide(10,2));
  }
}

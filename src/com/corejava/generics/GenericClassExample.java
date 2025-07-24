package com.corejava.generics;

// Generic classes
// We use < > to specify Parameter type

class SampleTest <T>{

    // An object of type T is declared
    T obj;

    SampleTest(T obj){
        this.obj = obj;
    }

    public T getObject(){

        return this.obj;
    }
}

public class GenericClassExample {

    public static void main(String[] args) {
        // instance of Integer type
        SampleTest <Integer> s1 = new SampleTest<Integer>(4);
        System.out.println(s1.getObject());

        // instance of String type
        SampleTest<String> s2= new SampleTest<String>("sumanth");
        System.out.println(s2.getObject());
    }
}

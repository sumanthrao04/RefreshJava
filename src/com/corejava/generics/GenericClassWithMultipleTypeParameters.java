package com.corejava.generics;

class MultipleObj <T,U>{

     T obj1;
     U obj2;

    MultipleObj(T obj1,U obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }

    void printInfo(){
        System.out.println(" Id : " + this.obj1 + " and the Name : " + this.obj2);

    }
}

public class GenericClassWithMultipleTypeParameters {

    public static void main(String[] args) {

        MultipleObj<Integer,String> MB1 = new MultipleObj<Integer,String>(4,"Sumanth");
        MB1.printInfo();

        MultipleObj<Integer,String> MB2 = new MultipleObj<Integer,String>(5,"Vamshi");
        MB2.printInfo();


    }
}

package com.corejava.oopsconcept.abstraction.interfaces;

interface testInterface{
    final int a=10;
          int b=20;
    void display();

}

class interfaceimpl implements   testInterface{
    @Override
    public void display() {
        System.out.println(" Interface basic example");
    }
}

public class InterfaceExample  {


    public static void main(String[] args) {
        interfaceimpl in1= new interfaceimpl();
        in1.display();

        System.out.println(testInterface.b);
    }
}

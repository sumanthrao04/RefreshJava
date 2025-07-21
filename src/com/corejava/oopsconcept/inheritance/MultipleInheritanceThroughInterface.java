package com.corejava.oopsconcept.inheritance;


interface Coder{
    void writeCode();
}

interface Tester{
    void testCode();
}


public class MultipleInheritanceThroughInterface implements Coder,Tester {
    @Override
    public void writeCode() {
        System.out.println("Devops Engineer writes automation scripts");
    }

    @Override
    public void testCode() {

        System.out.println("Devops Engineer Test the automation scripts");

    }

    public void DeployCode(){
        System.out.println("Devops Engineer Deploying the code");
    }

    public static void main(String [] args){
        MultipleInheritanceThroughInterface MI = new MultipleInheritanceThroughInterface();
        MI.writeCode();
        MI.testCode();
        MI.DeployCode();

    }
}

package com.corejava.oopsconcept;

public class EncapsulationExample {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args){
        EncapsulationExample  student = new EncapsulationExample();
        student.setName("Sumanth is refreshing java concepts");
        System.out.println("Student Name : " + student.getName());
    }

}

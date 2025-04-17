package com.corejava.exception.runtime;

public class NumberFormatExceptionSample {
    public static void main(String[] args){
       /* String name="sumanth";
        int age = Integer.parseInt(name);
        System.out.println(age);*/

        try{
            String name="sumanth";
            int age = Integer.parseInt(name);
            System.out.println(age);
        } catch ( NumberFormatException e) {
            System.out.println("Handling number format Exception" +e.getMessage());
            System.out.println("Handling number format Exception" +e.toString());
           // e.printStackTrace();
        }catch(Exception e){
            System.out.println("Handling Exception");
           // throw new RuntimeException(e);
        }

    }
}

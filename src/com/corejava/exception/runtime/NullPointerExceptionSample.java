package com.corejava.exception.runtime;

public class NullPointerExceptionSample {

    public static void main(String[] args){
        System.out.println("Started program");
       // String s =null;
        System.out.println("Before null pointer exception");
     /*   System.out.println(s.length());
        System.out.println("after null pointer exception");*/

        try {
            String s =null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("handling null pointer exception and please pass string value to s ");
            //throw new NullPointerException("Variable S value shouldn't be null");
        }
        catch (Exception e) {
            //handling null pointer exception
            System.out.println("handling All exception ");

           // throw new RuntimeException(e);
        }
    }

}

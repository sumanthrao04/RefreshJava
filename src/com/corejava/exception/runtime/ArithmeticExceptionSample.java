package com.corejava.exception.runtime;

public class ArithmeticExceptionSample {
    public static void main(String [] args){
        System.out.println("Practicing ArithmeticException ");
       // int result = 10/0;
        try {
            int result = 10 / 0;
            System.out.println("Result value" + result);
        }
         catch (Exception e) {
            //throw new java.lang.ArithmeticException("Integer cannot be divide by zero by sumanth");
            System.out.println("Integer cannot be divide by zero try 10/5  ");

        }
        System.out.println("Program is running smoothly");




    }


}
/* In line number 6 we are getting exception
 * int result = 10/0 Runtime exception to arithmetic exception
 * handling using try catch block
 * if we throw new java.lang.ArithmeticException in the code  program will distrust next line won't execute program will stop
 * because of that we are handling exception with meaning full sentences
 * */

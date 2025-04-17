package com.corejava.exception.runtime;

public class ArrayIndexOutOfBoundsExceptionSample {
    public static void main(String[] args){
        /*int[] a = new int[5];
         a[10]=100;
        System.out.println("10th element of Array" +a[10]);*/

        try {
            int[] a = new int[5];
            a[4]=100;
            System.out.println("10th element of Array" +a[4]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Handling Index out of bound exception" +e.getMessage());
            System.out.println(" Handling Index out of bound exception" +  e.toString());
          //  e.printStackTrace();
        }

        catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


}

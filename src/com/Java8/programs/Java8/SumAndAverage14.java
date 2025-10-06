package com.Java8.programs.Java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumAndAverage14 {

    public static void main(String [] args){
        int [] arr ={10,20,30,40,50};
        int sum1 = IntStream.of(arr).sum();

        double average1 = IntStream.of(arr).average().getAsDouble();
        System.out.println("Sum = " + sum1);
        System.out.println("Average = " + average1);

        int sum2= Arrays.stream(arr).sum();
        double average2 = Arrays.stream(arr).average().getAsDouble();

        System.out.println("Sum = " + sum2);
        System.out.println("Average = " + average2);


    }
}


/*Notes
*
* IntStream.of(...) in Java 8

It is a factory method in the IntStream class.

It creates a sequential IntStream from the given array of int values (or a varargs list of ints)
*
* If you pass an array, it treats the whole array as input and creates a stream of its elements.
* */
package com.Java8.programs.Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest11 {
    public static void main(String[] args){

        int arr[] = {12,35,1,10,34,1};
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        int secondLargest1= Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println("Second Largest Number: " + secondLargest1);

        int SecondLargest2 = listOfIntegers.stream()
                .distinct()
                .sorted((a,b)->b-a)
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second Largest Number: " + SecondLargest2);

    //Approach 2: Using limit() + min()

        int secondLarget3 = Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted((a,b)->b-a)
                .limit(2) // keep only top 2 numbers
                .min(Integer::compareTo)  // smallest among them = 2nd largest
                .get();
        System.out.println("Second Largest Number: " + secondLarget3);

    }
}

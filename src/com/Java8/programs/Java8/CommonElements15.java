package com.Java8.programs.Java8;


import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonElements15 {


    public static void main(String [] args){

        int[]  arr1 = {1, 2, 3, 4, 5};
        int []arr2 = {4, 5, 6, 7, 8};

        Set<Integer> set1 = IntStream.of(arr1).boxed().collect(Collectors.toSet());

        Set<Integer> common= IntStream.of(arr2).filter(set1::contains).boxed().collect(Collectors.toSet());
        System.out.println("Common Elements: " + common);


    }

}

/*Notes
*
*
* How it works?

Convert first array to a Set for O(1) lookup.

Stream over the second array.

Use filter(set1::contains) → keeps only elements present in both.

Collect into a Set to avoid duplicates.*/

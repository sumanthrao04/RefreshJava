package com.Java8.programs.Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseArrays18 {

    public static void main(String[] args) {
        int[] arr1 = {5, 1, 7, 3, 9, 6};

        int[] reversed = IntStream.rangeClosed(1,arr1.length).map(i->arr1[arr1.length-i]).toArray();
        System.out.println(Arrays.toString(reversed));

        //If it's Integer Array
        Integer[] arr = {10, 20, 30, 40, 50};

        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);

        System.out.println("Reversed Array: " + list);

    }

}

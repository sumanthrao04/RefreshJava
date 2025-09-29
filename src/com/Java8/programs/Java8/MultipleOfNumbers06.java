package com.Java8.programs.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleOfNumbers06 {

    public static void main(String [] args) {
        List<Integer> allNumbers = Arrays.asList(12, 10, 5, 55, 24, 87, 30);

        allNumbers.stream()
                .filter(n -> n % 5 == 0)
                .forEach(System.out::println);


    }



}

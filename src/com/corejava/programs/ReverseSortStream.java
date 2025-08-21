package com.corejava.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseSortStream {

    public static void main(String[] args) {

        List<Double> numbers = Arrays.asList(5.6,2.6,1.7,9.0);
        List<Double> reverseNumber= numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("The reverse order list" +reverseNumber);

    }
}

/*
*Explanation

decimals.stream() → creates a stream from the list.

.sorted(Comparator.reverseOrder()) → sorts elements in descending order.

.collect(Collectors.toList()) → collects the result into a new list
* */
package com.corejava.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {
        List<String> originalList = Arrays.asList("Orange", "Banana", "papaya", "Banana", "Apple", "Orange");
        Map<String, Long> wordFreq = originalList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(wordFreq);

        int[] numbers = {1, 2, 3, 4, 5, 6, 3, 1, 4, 2, 5, 6};
        Map<Integer, Long> countArray = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(countArray);
    }
}

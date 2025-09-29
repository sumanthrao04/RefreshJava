package com.Java8.programs.Java8;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesInList {

    public static void main(String[] args) {
        List<String> allElements = Arrays.asList("apple","banana","apple","orange","apple");
        List<String> uniqueElements = allElements.stream()
                .distinct().toList();

        System.out.println(uniqueElements);

    }
}

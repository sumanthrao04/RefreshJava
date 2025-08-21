package com.corejava.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesInList {

    public static void main(String[] args) {
        List<String> allElements = Arrays.asList("apple","banana","apple","orange","apple");
        List<String> uniqueElements = allElements.stream()
                .distinct().toList();

        System.out.println(uniqueElements);

    }
}

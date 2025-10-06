package com.Java8.programs.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsStartingWithNumber20 {

    public static void main(String[] args){

        List<String> list = Arrays.asList("123Hello", "World", "9lives", "Java8", "apple", "7up", "Code");
        List<String> result = list.stream().filter(n-> Character.isDigit(n.charAt(0))).toList();
        System.out.println("Strings starting with a number: " + result);
    }

}

/*Notes
*
*
* Explanation

list.stream() → Creates a stream from the list.

filter(...) → Filters out only those elements that satisfy the given condition.

Character.isDigit(s.charAt(0)) → Checks if the first character of the string is a digit (0–9).

collect(Collectors.toList()) → Collects the filtered elements back into a list.*/
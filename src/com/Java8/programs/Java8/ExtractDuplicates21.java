package com.Java8.programs.Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExtractDuplicates21 {

    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(5, 3, 8, 3, 9, 5, 2, 8, 1, 5);

        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicates = numbers.stream().filter(n-> !unique.add(n)).collect(Collectors.toSet());
        System.out.println("Duplicate elements: " + duplicates);

        //duplicate character

        String input = "sumanth is good Developer";
        String modified = input.replaceAll("\\s","").toLowerCase();

        Set<String> uniqueChars = new HashSet<>();

        Set<String> duplicateChars = Arrays.stream(modified.split(""))
                .filter(ch-> !uniqueChars.add(ch))
                .collect(Collectors.toSet());

        System.out.println("The duplicate characters : " +duplicateChars);
    }
}


/*Notes
*
* xplanation

unique.add(n) → returns true if element is added for the first time, otherwise false.

.filter(n -> !unique.add(n)) → keeps only elements that were already seen.

.collect(Collectors.toSet()) → removes duplicate duplicate values (keeps unique duplicates).
*
*
* */
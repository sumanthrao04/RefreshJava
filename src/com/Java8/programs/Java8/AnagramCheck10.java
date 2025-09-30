package com.Java8.programs.Java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Java 8 program to check if two strings are anagrams or not?
public class AnagramCheck10 {

    public static void main(String[] args) {

        String s1= "RaceCar ";
        String s2= "CarRace";


    //    Frequency Count Approach with Streams
        s1=s1.replaceAll("[^a-zA-Z]","").toUpperCase();
        s2=s2.replaceAll("[^a-zA-Z]","").toUpperCase();


        Map<Character,Long> frequerncyS1 = s1.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map<Character,Long> frequerncyS2 = s2.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

    if(frequerncyS1.equals(frequerncyS2)){
        System.out.println("Two strings are anagrams");
    }else {
        System.out.println("Two strings are not anagrams");
    }

    }

}


/*
* Notes
*
* Sorting is simpler but O(n log n).

Frequency counting is O(n), more efficient for long strings.
*
*
* String s1 = "RaceCar";
String s2 = "CarRace";

// Step 1: Split into characters → ["R","a","c","e","C","a","r"]
// Step 2: Convert all characters to uppercase → ["R","A","C","E","C","A","R"]
// Step 3: Sort → ["A","A","C","C","E","R","R"]
// Step 4: Join → "AACCRR"

// Do the same for s2 → "AACCRR"

// Step 5: Compare → If equal → anagram
*
*
*     //    Frequency Count Approach with Streams
* How it works

Normalize both strings (toUpperCase, remove spaces/punctuation if needed).

Convert each string to a stream of characters.

Collect into a Map<Character, Long> using Collectors.groupingBy(..., counting()).

Example: "RaceCar" → {R=2, A=2, C=2, E=1}

Compare the two maps. If equal → strings are anagrams

* Pros

O(n) time complexity (faster than sorting for large strings).

Handles frequency directly (no need to join sorted strings).

Works well in interviews to show alternative solution.
* */

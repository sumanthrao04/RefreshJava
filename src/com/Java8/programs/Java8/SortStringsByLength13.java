package com.Java8.programs.Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringsByLength13 {

    public static void main(String[] args){


        List<String> Strings = Arrays.asList("Java", "SpringBoot", "JMS", "Microservices", "API");
        List<String> Strings2 = Arrays.asList("Java", "SpringBoot", "JMS", "Microservices", "API");
        List<String> sortedString = Strings.stream().sorted(Comparator.comparingInt(String::length))
                .toList();
        Collections.sort(Strings2,(s1,s2)->Integer.compare(s1.length(),s2.length()));

        System.out.println("Sorted by length (increasing): " + Strings2);

        System.out.println("Sorted by length (increasing): " + sortedString);

        //BY descending order

        Collections.sort(Strings2,(s1,s2)->Integer.compare(s2.length(),s1.length()));
        System.out.println("Sorted by length (descending): " + Strings2);

        List<String> descending = Strings.stream().sorted(Comparator.comparingInt(String::length).reversed()).toList();

        System.out.println("Sorted by length (descending): " + descending);


    }
}


/*
* Notes
*
* comparingInt takes a ToIntFunction (a function that returns an int).

Here we pass String::length as a method reference (same as s -> s.length()).

So for each string, it extracts its length and uses it as the sorting key.

Then it returns a Comparator<String> that can be used to sort strings by their length.
*
* */



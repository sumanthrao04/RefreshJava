package com.corejava.programs.Java8;


import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequency {
    public static void main(String[] args) {
        String charFreq= "proggramming";
        Map<Character, Long> freq= charFreq.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting() ));
        System.out.println(freq);

    }



}

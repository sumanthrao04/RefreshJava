package com.corejava.programs.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStrings {

    public static void main(String[] args) {
        List<String> words= Arrays.asList("Applle","banana","jackfruit","Mango");

        String joinString= words.stream()
                .collect(Collectors.joining(",","[","]"));

        System.out.println(joinString);
    }



}

/*
*Explanation

Collectors.joining(delimiter, prefix, suffix)

delimiter → separates elements (",")

prefix → added before the result ("[")

suffix → added after the result ("]")

So "apple", "banana", "cherry" becomes "[apple,banana,cherry]".
* */
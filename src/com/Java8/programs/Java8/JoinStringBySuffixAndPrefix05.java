package com.Java8.programs.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringBySuffixAndPrefix05 {
    public static void main(String [] args){

        List<String> words = Arrays.asList("Sumanth","Nagendra","Rahul");
        String proccessWords = words.stream()
                .collect(Collectors.joining("," ,"[","]"));

        System.out.println("The Processed word : " +proccessWords );



    }
}

/*
*Explanation

Collectors.joining(delimiter, prefix, suffix)

delimiter → separates elements (",")

prefix → added before the result ("[")

suffix → added after the result ("]")

So "apple", "banana", "cherry" becomes "[apple,banana,cherry]".
*
* Collectors.joining()

It’s a collector that concatenates elements of a stream into a single String.

Overloads:

joining() → joins without delimiter.

joining(delimiter) → joins with a delimiter.

joining(delimiter, prefix, suffix) → joins with delimiter, and adds a prefix at the start and a suffix at the end. (this is what you’re using)
* */
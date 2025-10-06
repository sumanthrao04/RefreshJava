package com.Java8.programs.Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString16 {

    public static void main(String[] args){
        String Input = "Java 8 Streams are powerful";

        String Result = Arrays.stream(Input.split(" "))
                .map(word-> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println("The Original String : " +Input);
        System.out.println("The Reversed  String : " +Result);

        List<String> sentenceReverse = Arrays.asList(Input.split(" "));
        Collections.reverse(sentenceReverse);

        String Result2 = sentenceReverse.stream().collect(Collectors.joining(" "));
        System.out.println("The Reversed  Sentence : " +Result2);


    }
}

/*Notes
*
*
* Explanation:

input.split(" ")
→ Splits the sentence into words (["Java", "8", "Streams", "are", "powerful"])

Arrays.stream(...)
→ Converts the array into a stream for functional processing.

.map(word -> new StringBuilder(word).reverse().toString())
→ Reverses each individual word.

Collectors.joining(" ")
→ Joins the reversed words back into a single string separated by spaces.*/
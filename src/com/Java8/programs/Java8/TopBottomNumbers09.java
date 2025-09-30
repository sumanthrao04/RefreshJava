package com.Java8.programs.Java8;

//How do you get three maximum numbers and three minimum numbers from the given list of integers?

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TopBottomNumbers09 {
    public static void main(String[] args){
        List<Integer> allNumbers = Arrays.asList(45,11,56,15,77,89,32,12,76,46,87);

        //3 maximum numbers
        List<Integer> maxThree = allNumbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(4)
                .toList();

        //3 minmum numbers
        List<Integer> minThree = allNumbers.stream()
                .sorted(Comparator.naturalOrder())
                .limit(3)
                .toList();

        System.out.println("Original List : " + allNumbers);
        System.out.println("Top 3 Maximum Numbers : " + maxThree);
        System.out.println("Top 3 Minimum Numbers : " + minThree);

    }
}

/*
* Notes
*
* What limit() Does

limit(n) is a short-circuiting intermediate operation in Java Streams.

It takes at most n elements from the stream and discards the rest.
*
*
* 1. Streams Are Lazy

In Java Streams, operations like map(), filter(), sorted(), etc. are lazy.

That means they don’t actually run immediately when you write them — instead, they build a pipeline of steps to execute only when a terminal operation (like .toList(), .collect(), .forEach()) is called.
*
* 2. Intermediate Operations

Operations like filter(), map(), sorted(), limit() are called intermediate operations because they sit in the middle of the stream pipeline.

They transform the stream into another stream, but don’t produce a final result yet.
*
* 3. Short-Circuiting

Some intermediate operations can stop processing early without looking at all elements of the stream.

That’s called short-circuiting.

Example with limit(4):

Suppose you have a stream of 1 million numbers.

Normally, if you sort it, Java might try to process everything.

But when you add .limit(4), the stream knows it only needs 4 results.

So it will stop as soon as it has the top 4 elements, instead of traversing everything unnecessarily.
*
* 4. Examples of Short-Circuiting

limit(n) → takes only the first n elements.

findFirst() / findAny() → stops once it finds an element.

anyMatch() / allMatch() / noneMatch() → can stop early once the result is known.
*
*
* */
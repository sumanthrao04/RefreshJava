package com.Java8.programs.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEvenSeparator01 {


public  static void oddEvenSeparateWithpartitioningBy(){
    List<Integer> allnumbers = Arrays.asList(1,2,3,4,5,6,7,9,10,12,11);

    Map<Boolean, List<Integer>> practionedList = allnumbers.stream()
            .collect(Collectors.partitioningBy((num-> num%2 ==0)));

    List<Integer> allEvenNumbers = practionedList.get(true);
    List<Integer> allOddNumbers = practionedList.get(false);
    System.out.println( "Even Numbers : "+allEvenNumbers);
    System.out.println("odd Numbers : "+allOddNumbers);

}

public static void OddEvenSeparatorWithoutPartition(){

    List<Integer> allNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    List<Integer> evenNumbers = allNumbers.stream().filter(num-> num%2==0).toList();
    List<Integer> oddNumbers = allNumbers.stream().filter(num-> num%2 != 0).toList();
    System.out.println("The Even Numbers" + evenNumbers);
    System.out.println("The Odd Numbers" + oddNumbers);

}

public static void OddEvenOneLiner(){
    List<Integer> allNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    Map<Boolean,List<Integer>> byGorupingBy = allNumbers.stream().collect(Collectors.groupingBy(num->num%2==0));
    System.out.println("The Even Number " + byGorupingBy.get(true));
    System.out.println("The odd Number " + byGorupingBy.get(false));

}

    public static void main(String[] args) {
        OddEvenSeparator01.oddEvenSeparateWithpartitioningBy();
        OddEvenSeparator01.OddEvenSeparatorWithoutPartition();
        OddEvenSeparator01.OddEvenOneLiner();

    }

}



/*
Notes -1

Step-by-Step Execution
Stream creation
numbers.stream() → creates a stream of integers from your list [1,2,3,4,5,6,7,8,9,10].
Collector applied
Collectors.partitioningBy(...) takes a predicate (boolean condition).
In your case: num -> num % 2 == 0
If true → number is even.
If false → number is odd.
Processing each element

partitioningBy internally traverses the stream once.
For each element:
If condition is true, it goes into the true bucket (even numbers).
If condition is false, it goes into the false bucket (odd numbers).

Why is partitioningBy special?
Always returns two groups only:
true group
false group
It’s optimized → makes only one pass over the data.
Better than using two filter() calls when you need both partitions.

Notes - 2
groupingBy → can produce multiple groups (not limited).
partitioningBy → always produces 2 groups (true, false).

What is groupingBy?
groupingBy is a collector factory method in Collectors that returns a Collector which groups elements of a stream based on a classification function (key function).

How it Works Internally
Stream traversed once
For each element, the classifier function is applied → produces a key.
Collector stores into Map
If the key already exists → element is added to the list for that key.
If the key does not exist → a new list is created and element is added.
Final Map returned

if you are using grouping by or partitioningBy  then use map to store the result
* */
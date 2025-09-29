package com.Java8.programs.Java8;

import java.util.Arrays;
import java.util.List;

public class MultiplesOfFiveLoop {

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(20,34,15,25,70,45);
        List<Integer> multipleOfFive= numbers.stream().filter(n-> n%5 ==0).toList();
        System.out.println("Multiple of five" +multipleOfFive);
    }

}

/*What is filter()?

filter() is an intermediate operation in Java Streams.

It takes a predicate (boolean condition) and returns a new stream containing only elements that match the condition.

Stream elements one by one.

Apply the given condition (n % 5 == 0).

Keep only those elements that evaluate to true.

Pass the filtered stream to the next operation (collect in this case).
*/
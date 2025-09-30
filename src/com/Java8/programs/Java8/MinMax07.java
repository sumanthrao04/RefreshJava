package com.Java8.programs.Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MinMax07 {

    public static void main(String [] args){
        List<Integer> allNumbers= Arrays.asList(10,3,45,7,19,26,88);

        //Approach 1: Using Stream.max() and Stream.min()
        int max1 = allNumbers.stream()
                .max(Integer::compareTo)
                .get();

        int max2 = allNumbers.stream().max(Comparator.naturalOrder())
                .get();

        int min1 = allNumbers.stream()
                .min(Comparator.naturalOrder())
                .get();

        int  min2 = allNumbers.stream()
                .min(Integer::compareTo)
                .get();

        System.out.println("Approach 1 The maximum value : " +max1);
        System.out.println("Approach 1 The maximum value : " +max2);

        System.out.println("Approach 1 The minimum value : " +min1);
        System.out.println("Approach 1 The minimum value : " +min1);

     //   Approach 2: Using mapToInt with IntStream

         int max3 = allNumbers.stream()
                 .mapToInt(Integer::intValue)
                 .max()
                 .getAsInt();

         int min3 = allNumbers.stream()
                 .mapToInt(Integer::intValue)
                 .min()
                 .getAsInt();

        System.out.println("Approach 2 The maximum value : " +max3);

        System.out.println("Approach 2 The minimum value : " +min3);

        //Approach 3: Using Collectors

        int max4= allNumbers.stream()
                .collect(Collectors.maxBy(Integer::compareTo))
                .get();

        int min4= allNumbers.stream()
                .collect(Collectors.minBy(Integer::compareTo))
                .get();

        System.out.println("Approach 3 The maximum value : " +max4);

        System.out.println("Approach 3 The minimum value : " +min4);
    }

}


/* Notes
*1. How max and min work in Streams

Stream<T>.max(Comparator<? super T> comparator)
Finds the maximum element of the stream according to the provided comparator.

Stream<T>.min(Comparator<? super T> comparator)
Finds the minimum element of the stream according to the provided comparator.

Both return an Optional<T> (so you need .get() if you are sure the stream is non-empty).
*
*
*Why both work

max(Integer::compareTo)
Uses Integer.compareTo for comparisons.

max(Comparator.naturalOrder())
Uses the comparator returned by Comparator.naturalOrder() (internally also calls compareTo).

Same for min(...).

That’s why max1 == max2 and min1 == min2 when the stream is non-empty.
*
*Approch 2
*
* numbers.stream()

Creates a Stream<Integer> from your list (or collection) of Integer objects.

This is an object stream (not primitive).
*
*
* .mapToInt(Integer::intValue)

Converts each Integer object into a primitive int.

Produces an IntStream (a special stream optimized for primitive int).

Why?

Avoids autoboxing/unboxing overhead.

Provides additional specialized methods (sum, average, max, min, etc.).
*
*
* .max() / .min()

Operate directly on the IntStream.

They return an OptionalInt, not Optional<Integer> (since it’s dealing with primitives).

.max() finds the largest int in the stream.

.min() finds the smallest int in the stream.
*
*
* .getAsInt()

Extracts the primitive int value from the OptionalInt.

This is safe only if you’re sure the stream isn’t empty (otherwise it will throw NoSuchElementException).
*
*Key Difference from Your Earlier Code

Earlier: You stayed with Stream<Integer> and used .max(Comparator) / .min(Comparator).

Now: You convert to IntStream (primitive specialization), so you get methods like .max() / .min() directly, which are faster and avoid boxing/unboxing.
*
*Approach 3
*
* Explanation:

max() / min() → directly give max and min using a comparator.

mapToInt → converts to IntStream for numeric operations (max(), min(), sum(), average()).

Collectors.maxBy / Collectors.minBy → used when collecting results (useful in reduction scenarios
*
*
* Out of these, Approach 2 (mapToInt) is the most efficient because it works directly with primitive int values (avoids boxing/unboxing).
*
* */
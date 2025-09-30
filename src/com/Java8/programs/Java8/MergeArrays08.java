package com.Java8.programs.Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeArrays08 {

    public static void main(String [] args){
    int [] arr1 ={5,2,8,3};
    int [] arr2 = {7,1,9,4,3};

    //MERGE AND SORT

        int[] mergeSortedArrays = IntStream.concat(Arrays.stream(arr1) ,Arrays.stream(arr2))
                .sorted()
                .toArray();

        System.out.println("Merged and Sorted Array: " + Arrays.toString(mergeSortedArrays) );


        //Example (Remove Duplicates + Sort Ascending):

        int[] mergedwithoutDuplicates = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2))
                .distinct().sorted().toArray();

        System.out.println("Merged, Unique & Sorted: " + Arrays.toString(mergedwithoutDuplicates));


        //Example (Remove Duplicates + Sort Descending):
        Integer[] mergedUniqueDesc = Stream.concat( Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed() )
                .distinct().sorted(Comparator.reverseOrder())
                .toArray(Integer[]::new);

        System.out.println("Merged, Unique & Descending: " + Arrays.toString(mergedUniqueDesc));


    }
    }







/*Notes
*
*Summary of Methods

Arrays.stream(arr) → turn array into IntStream.

IntStream.concat(a, b) → merge two streams.

.sorted() → sort values in ascending order.

.toArray() → collect results into a new array.
*
* What is IntStream?
* IntStream is a specialized stream for working with primitive int values.

Part of java.util.stream package.

Avoids autoboxing/unboxing overhead (compared to Stream<Integer>).

Provides methods specifically designed for working with numbers (like sum(), average(), max(), min() etc.).
*
* How it works
* Normally, Stream<Integer> wraps primitive int values in Integer objects (autoboxing).
That means extra memory and performance cost.

IntStream keeps them as raw int values, making operations faster and more memory efficient.
*
*.toArray(Integer[]::new)

Collects the elements back into an array.

Integer[]::new is a constructor reference:

It tells the stream what type of array to create (Integer[]).

Without this, you’d get Object[] instead of Integer[].

📌 Example: [9, 8, 7, 5, 2, 1] (stream) → becomes Integer[] {9, 8, 7, 5, 2, 1}.
*
*
*
* */

/* Prerequisite of array*/

/*
* 1. What is an Array?

An array is a fixed-size, ordered collection of elements of the same type.

Stored in contiguous memory locations.

Accessed by index (0-based).
*
* Creating Arrays
* int[] numbers;   // preferred style
int numbers[];   // also valid (C-style)
*
* (b) Initialization with new
* numbers = new int[5]; // array of 5 integers, all initialized to 0

* (c) Declaration + Initialization
* int[] numbers = new int[5]; // default values assigned
Java allocates memory for 5 int slots.
Each element gets the default value for int, which is 0
*
* (d) Initialization with values
* int[] numbers = {1, 2, 3, 4, 5}; // size = 5, values given directly

* 3. Default Values
* When you create an array with new, Java automatically assigns default values:

int, long, short, byte → 0

float, double → 0.0

char → '\u0000' (null character)

boolean → false

Objects (String, custom classes, etc.) → null
*
* String[] names = new String[3];
// [null, null, null]

* 4. Accessing Elements
* Arrays are 0-indexed.
*
* int[] arr = {10, 20, 30};
System.out.println(arr[0]); // 10
System.out.println(arr[2]); // 30

* Accessing out of bounds throws:
* System.out.println(arr[3]);
// java.lang.ArrayIndexOutOfBoundsException

*
* Looping:
* for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

for (int value : arr) { // enhanced for loop
    System.out.println(value);
}

* Utility methods (java.util.Arrays):
* import java.util.Arrays;

int[] arr = {3, 1, 4, 2};
Arrays.sort(arr); // sort array
System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4]

*
* Things to Keep in Mind
*
* Fixed size → once created, cannot grow/shrink.

If you need dynamic resizing, use ArrayList.

Indexing starts at 0 → last index = length - 1.

Homogeneous elements only → all elements must be of the same type.

Memory efficiency → arrays are faster than collections but less flexible.

Multidimensional arrays in Java are arrays of arrays (can be jagged, not always rectangular).

Default values → important to remember when dealing with uninitialized objects.

*

*
*
*
*
*
* */





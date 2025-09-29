package com.Java8.programs.Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DecimalsReverseOrder04 {

    public static void main(String[] args){

        List<Double> doubleValue = Arrays.asList(0.64,0.88,1.0,2.5,0.1);
        List<Double> reverseOrder = doubleValue.stream().sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("The reverse order decimal values" + reverseOrder);

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1);
         Collections.sort(numbers,Comparator.reverseOrder());
        System.out.println("Reverse Sorted List: " + numbers);

    }
}


/* Notes
*
* Comparator.reverseOrder() is a built-in comparator that sorts elements in descending order.
*Collections.sort modifies the original list
* Comparator.reverseOrder() flips natural sorting.
*
*
* */
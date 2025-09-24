package com.Java8.MethodReference;

import java.util.Arrays;

public class MethodRefSimple {

    public static void main(String[] args) {
        String[] names = {"John", "Alice", "Bob"};

        // Using lambda
        // Arrays.sort(names, (s1, s2) -> s1.compareToIgnoreCase(s2));

        // Using method reference
        Arrays.sort(names, String::compareToIgnoreCase);

        // Print result
        for (String name : names) {
            System.out.println(name);
        }
    }
}

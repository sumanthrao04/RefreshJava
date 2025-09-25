package com.Java8.Optional;

import java.util.Optional;

public class OptionalMethods {

    public static void main(String[] args) {
        // ==========================
        // 1. CREATION
        // ==========================
        Optional<String> opt1 = Optional.of("Sumanth");
        Optional<String> opt2 = Optional.ofNullable(null);
        Optional<String> opt3 = Optional.empty();

        System.out.println("opt1 = " + opt1); // Optional[Java]
        System.out.println("opt2 = " + opt2); // Optional.empty
        System.out.println("opt3 = " + opt3); // Optional.empty


        // ==========================
        // 2. CHECK PRESENCE
        // ==========================
        System.out.println("opt1.isPresent() = " + opt1.isPresent()); // true
        System.out.println("opt2.isPresent() = " + opt2.isPresent()); // false
        System.out.println("opt3.isEmpty()   = " + opt3.isEmpty());   // true (Java 11+)

        // ==========================
        // 3. RETRIEVE VALUE
        // ==========================
        System.out.println("opt1.get() = " + opt1.get()); // "Java"
        System.out.println("opt2.orElse('Default') = " + opt2.orElse("Default"));
        System.out.println("opt2.orElseGet(...)   = " +
                opt2.orElseGet(() -> "Generated Default"));

        try {
            System.out.println("opt2.orElseThrow(...) = " +
                    opt2.orElseThrow(() -> new RuntimeException("Value missing")));
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        // ==========================
        // 4. CONDITIONAL EXECUTION
        // ==========================
        opt1.ifPresent(val -> System.out.println("ifPresent -> Value is: " + val));
        opt2.ifPresentOrElse(
                val -> System.out.println("ifPresentOrElse -> Present: " + val),
                () -> System.out.println("ifPresentOrElse -> Nothing here!")
        );

        // ==========================
        // 5. TRANSFORMING VALUES
        // ==========================
        // map
        Optional<Integer> length = opt1.map(String::length);
        System.out.println("map -> Length of Java = " + length.orElse(0));

        // flatMap
        Optional<Optional<String>> nested = Optional.of(Optional.of("Hi"));
        System.out.println("nested = " + nested);
        System.out.println("flatMap -> " + nested.flatMap(x -> x));

        // filter
        System.out.println("filter (startsWith J) -> " +
                opt1.filter(s -> s.startsWith("J")));
        System.out.println("filter (startsWith X) -> " +
                opt1.filter(s -> s.startsWith("X")));

        // ==========================
        // 6. UTILITY METHODS
        // ==========================
        System.out.println("equals -> " + opt1.equals(Optional.of("Java")));
        System.out.println("hashCode -> " + opt1.hashCode());
        System.out.println("toString -> " + opt1.toString());

    }

}

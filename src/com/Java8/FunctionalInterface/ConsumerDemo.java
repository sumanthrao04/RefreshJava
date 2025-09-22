package com.Java8.FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<String> printer = s-> System.out.println("Hello " +s);
        printer.accept("Sumanth");

        Consumer<String> consumer1 = s -> System.out.println("Uppercase: " + s.toUpperCase());
        Consumer<String> consumer2 = s -> System.out.println("Length: " + s.length());

        // Chain them using andThen
        Consumer<String> combined = consumer1.andThen(consumer2);

        combined.accept("Hello");

    }
}

package com.Java8.FunctionalInterface;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get()); // e.g., 0.6573

        String value = null;
        String result = java.util.Optional.ofNullable(value)
                .orElseGet(() -> "Default Value");
        System.out.println(result); // Default Value

    }
}

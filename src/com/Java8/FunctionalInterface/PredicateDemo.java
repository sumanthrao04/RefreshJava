package com.Java8.FunctionalInterface;

import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> names = s->s.startsWith("A");
        System.out.println(names.test("B"));
        System.out.println(names.test("A"));

        List<String> names2 = List.of("Alex", "Brian", "Charles");
        names2.stream()
                .filter(n -> n.startsWith("B"))
                .forEach(s-> System.out.println(s));
    }
}

package com.Java8.programs.Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates02 {

    public static void main(String[] args) {
        List<Integer> allNumbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 5);

        List<Integer> Bydistinct = allNumbers.stream()
                .distinct().toList();
        System.out.println("By using Distinct: " + Bydistinct);

        List<Integer> byset = allNumbers.stream().collect(Collectors.toSet())
                .stream().collect(Collectors.toList());
        System.out.println("By set :" +byset);

        Set<Integer> byUsingHashset = new HashSet<>();
        List<Integer>  byusingHashset = allNumbers.stream()
                .filter(byUsingHashset::add)
                .collect(Collectors.toList());

        System.out.println("By Using Haset: "  +byusingHashset);

        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Alice", 40) // duplicate by name
        );


        List<String> uniqueNames =people.stream()
                .map(person ->person.name )
                .distinct()
                .toList();

        System.out.println("People with unique Name: " +uniqueNames);



    }





}
class Person {
    String name;
    int age;
    Person(String name, int age) { this.name = name; this.age = age; }
}

/*

Notes

Implementation Details
When you call .distinct(), the stream pipeline inserts a special DistinctOp.
During processing, it uses a LinkedHashSet (via StreamSupport), which:
Preserves encounter order (insertion order).
Ensures uniqueness (Set doesn’t allow duplicates)


How does it know duplicates?
Set.add(e) uses:
hashCode() → to bucket the element.
equals() → to check exact equality.

* */
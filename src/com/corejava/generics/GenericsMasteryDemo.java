package com.corejava.generics;

import java.util.*;

// 1. Generic Class Example
// A generic class Box that can hold any type of object
class MatchBox<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

// 2. Generic Method Example
// A generic method that prints elements of any type of array
class Utility {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println("Element: " + element);
        }
    }
}

// 3. Bounded Type Parameter (extends)
// Only allows types that are subclasses of Number
class Calculator<T extends Number> {
    public double square(T number) {
        return number.doubleValue() * number.doubleValue();
    }
}

// 4. Unbounded Wildcard <?>
// A method that accepts a list of any type
class WildcardDemo {
    public void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println("Item: " + obj);
        }
    }

    // 5. Upper Bounded Wildcard <? extends Number>
    public double sumList(List<? extends Number> numbers) {
        double sum = 0;
        for (Number n : numbers) {
            sum += n.doubleValue();
        }
        return sum;
    }

    // 6. Lower Bounded Wildcard <? super Integer>
    public void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        System.out.println("Added integers to list.");
    }
}

// 7. Generic Interface
interface Printer<T> {
    void print(T item);
}

// 8. Generic Interface Implementation
class StringPrinter implements Printer<String> {
    public void print(String item) {
        System.out.println("Printing: " + item);
    }
}

// 9. Multiple Type Parameters
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void show() {
        System.out.println("Key: " + key + ", Value: " + value);
    }
}

public class GenericsMasteryDemo {
    public static void main(String[] args) {
        // Generic Class
        MatchBox<String> stringBox = new MatchBox<>();
        stringBox.setItem("Hello Generics");
        System.out.println("Box contains: " + stringBox.getItem());

        // Generic Method
        Integer[] nums = {1, 2, 3};
        Utility.printArray(nums);

        // Bounded Type
        Calculator<Integer> calc = new Calculator<>();
        System.out.println("Square of 4: " + calc.square(4));

        // Unbounded Wildcard
        WildcardDemo demo = new WildcardDemo();
        List<String> names = Arrays.asList("Alice", "Bob");
        demo.printList(names);

        // Upper Bounded Wildcard
        List<Double> doubles = Arrays.asList(1.1, 2.2, 3.3);
        System.out.println("Sum: " + demo.sumList(doubles));

        // Lower Bounded Wildcard
        List<Number> numberList = new ArrayList<>();
        demo.addIntegers(numberList);
        demo.printList(numberList);

        // Generic Interface
        Printer<String> printer = new StringPrinter();
        printer.print("Hello Interface");

        // Multiple Type Parameters
        Pair<String, Integer> pair = new Pair<>("Age", 25);
        pair.show();
    }
}


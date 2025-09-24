package com.Java8.MethodReference;

import java.util.function.BiFunction;
import java.util.function.Function;

class Student {
    String name;
    int age;

    public Student(String s, int a) {
        this.name = s;
        this.age=a;

    }
}
public class ConstructorRef {

    public static void main(String[] args) {
        BiFunction<String, Integer, Student> studentCreator = Student::new;

        Student s = studentCreator.apply("Alice", 26);
        System.out.println(s.name);
        System.out.println(s.age);
    }
}

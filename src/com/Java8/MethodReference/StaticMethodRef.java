package com.Java8.MethodReference;

import java.util.function.BiFunction;

public class StaticMethodRef {

    public static  int add(int a, int b){
        return  a+b;
    }

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> sum = StaticMethodRef::add;

        System.out.println(sum.apply(5,5));
    }
}

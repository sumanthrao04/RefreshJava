package com.Java8.MethodReference;

import java.util.function.Supplier;

public class InstanceMethodRef {

    public String getmessage(){
        return "Hello, Method Reference";
    }

    public static void main(String[] args) {

        InstanceMethodRef obj = new InstanceMethodRef();
        Supplier<String> supplier = obj::getmessage;
        System.out.println(supplier.get());
    }
}

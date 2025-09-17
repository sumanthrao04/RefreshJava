package com.Java8.lambdaExpression;

@FunctionalInterface
interface  MultipleLambda{

    int operation(int a, int b);
}

public class LambdaExpressionWithMultipleParameters {

    public static void main(String[] args) {
        MultipleLambda add = (int a, int b)-> a+b;
        MultipleLambda subtract = (int a, int b)-> a-b;
        MultipleLambda multiply = (int a, int b)-> a*b;

        System.out.println(add.operation(10,2));
        System.out.println(subtract.operation(5,3));
        System.out.println(multiply.operation(2,2));

    }
}

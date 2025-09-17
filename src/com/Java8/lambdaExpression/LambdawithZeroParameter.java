package com.Java8.lambdaExpression;

@FunctionalInterface
 interface ZeroParameter {
void displsy();
 }

public class LambdawithZeroParameter {

    public static void main(String[] args) {

        ZeroParameter zeroParameter = ()-> System.out.println("This is a zero-parameter lambda expression!");
        zeroParameter.displsy();
    }
}

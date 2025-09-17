package com.Java8.lambdaExpression;


import java.util.ArrayList;

public class LambdawithSingleParameter {

    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(10);
        a1.add(2);
        a1.add(10);
        a1.add(16);
        a1.add(3);

        System.out.println("Elements of an array list");
        a1.forEach(n-> System.out.println(n));

        System.out.println("Evene elements");
        a1.forEach(n->{

            if(n%2==0){
                System.out.println(" The number is Even : " +n);
            }else{
                System.out.println("The number is Odd : " +n);
            }
        });

    }



}

package com.Java8.programs.Java8;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class EvenOddNumbersStream19 {

    public static void main(String[] args){


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : " );
        int input = sc.nextInt();

        IntStream.rangeClosed(1,input).map(i->i*2).forEach(System.out::println);

    }
}

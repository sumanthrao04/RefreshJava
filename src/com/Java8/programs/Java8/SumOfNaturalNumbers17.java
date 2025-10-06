package com.Java8.programs.Java8;

import javax.xml.transform.Source;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SumOfNaturalNumbers17 {

    public static void main(String[] args){

        int sumOfFirstNNumbers = IntStream.rangeClosed(1,10).sum();
        System.out.println("The first 10 Numbers Sum: "+sumOfFirstNNumbers);

        //By Using Formula

        int n=10;
        int sum=n*(n+1)/2;
        System.out.println("Sum of first 10 natural numbers: " + sum);

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number N: ");
        int userInput =sc.nextInt();

        int sum2 = IntStream.rangeClosed(1,userInput).sum();
        System.out.println("Sum of first " + n + " natural numbers: " + sum2);

    }
}

/*Notes
*
*
* IntStream.rangeClosed(1, 10) → generates numbers from 1 to 10 (inclusive).

.sum() → adds all numbers in the stream.
* using formula sum=n*(n+1)/2;
*
*nextInt() is a Scanner method that reads the next integer entered by the user from the console.
* Scanner sc = new Scanner(System.in);

Scanner is a Java class in java.util package used to take input from the user.

System.in refers to the standard input stream, i.e., your keyboard.

So this line creates a Scanner object named sc that reads data typed by the user.
* */
package com.deloitte.lab09.ex05;

import java.util.Scanner;

@FunctionalInterface
interface FactorialCalculator {
    int calculate(int n);
}

class Factorial {
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}

public class Lab9Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        
        FactorialCalculator factorial = Factorial::calculateFactorial;
        int result = factorial.calculate(number);
        System.out.println("Factorial of " + number + " is: " + result);
        
        scanner.close();
    }
}

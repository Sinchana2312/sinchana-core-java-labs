package com.deloitte.lab05.ex01;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Lab5Ex1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of the person: ");
        int age = sc.nextInt();

        try {
            validateAge(age);
            System.out.println("Age is valid: " + age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age <= 15) {
            throw new InvalidAgeException("Age must be above 15.");
        }
    }
}

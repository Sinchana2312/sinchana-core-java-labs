package com.deloitte.lab05.ex02;

import java.util.Scanner;

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

public class Lab5Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter middle name (leave blank if not applicable): ");
        String middleName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        try {
            validateFullName(firstName, lastName);
            String fullName = firstName + (middleName.isEmpty() ? "" : " " + middleName) + " " + lastName;
            System.out.println("Full name is valid: " + fullName.trim());
        } catch (InvalidNameException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    public static void validateFullName(String firstName,String lastName) throws InvalidNameException {
        if (firstName.trim().isEmpty() || lastName.trim().isEmpty()) {
            throw new InvalidNameException("First name and last name cannot be blank.");
        }
    }
}


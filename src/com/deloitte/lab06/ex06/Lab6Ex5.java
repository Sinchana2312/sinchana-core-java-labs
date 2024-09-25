package com.deloitte.lab06.ex06;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Lab6Ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> people = new HashMap<>();

        System.out.println("Enter the number of people:");
        int n = 0;
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        }
        scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (int i = 0; i < n; i++) {
            System.out.println("Enter ID and Date of Birth (yyyy-MM-dd):");
            String id = scanner.nextLine().trim();
            String dobInput = scanner.nextLine().trim();

            if (id.isEmpty() || dobInput.isEmpty()) {
                System.out.println("ID and DOB cannot be empty, please try again.");
                i--;
                continue;
            }

            try {
                LocalDate dob = LocalDate.parse(dobInput, formatter);
                LocalDate today = LocalDate.now();

                if (dob.isAfter(today)) {
                    System.out.println("Date of birth cannot be in the future, please try again.");
                    i--;
                    continue;
                }

                people.put(id, dobInput);

            } catch (DateTimeParseException e) {
                System.out.println("Invalid Date of Birth format. Please use yyyy-MM-dd. Try again.");
                i--;
            }
        }

        List<String> eligibleVoters = votersList(people);
        System.out.println("Eligible Voter IDs: " + eligibleVoters);
        scanner.close();
    }

    static List<String> votersList(Map<String, String> people) {
        List<String> eligibleIds = new ArrayList<>();
        LocalDate today = LocalDate.now();

        for (Map.Entry<String, String> entry : people.entrySet()) {
            try {
                LocalDate dob = LocalDate.parse(entry.getValue());
                int age = Period.between(dob, today).getYears();

                if (age >= 18) {
                    eligibleIds.add(entry.getKey());
                }
            } catch (DateTimeParseException e) {
                System.out.println("Error parsing date for ID: " + entry.getKey());
            }
        }
        return eligibleIds;
    }
}

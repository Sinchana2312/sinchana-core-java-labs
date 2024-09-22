package com.deloitte.lab06.ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab6Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> studentMarks = new HashMap<>();

        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter registration number and marks (format: regNum marks):");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String regNum = parts[0];
            int marks = Integer.parseInt(parts[1]);

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks for student " + regNum + ". Marks should be between 0 and 100.");
                continue; 
            }

            studentMarks.put(regNum, marks);
        }

        Map<String, String> medalWinners = getStudents(studentMarks);
        System.out.println("Students eligible for medals: " + medalWinners);
        scanner.close();
    }

    static Map<String, String> getStudents(HashMap<String, Integer> marksMap) {
        HashMap<String, String> eligibleStudents = new HashMap<>();

        for (Map.Entry<String, Integer> entry : marksMap.entrySet()) {
            int marks = entry.getValue();
            String regNum = entry.getKey();
            String medal = "";

            if (marks >= 90) {
                medal = "Gold";
            } else if (marks >= 80) {
                medal = "Silver";
            } else if (marks >= 70) {
                medal = "Bronze";
            }

            if (!medal.isEmpty()) {
                eligibleStudents.put(regNum, medal);
            }
        }

        return eligibleStudents;
    }
}


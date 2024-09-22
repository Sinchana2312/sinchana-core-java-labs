package com.deloitte.lab06.ex06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Lab6Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> people = new HashMap<>();

        System.out.println("Enter the number of people:");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Enter ID and age (separated by a space):");
            String id = scanner.nextLine();
            int age = scanner.nextInt();
            scanner.nextLine();
            people.put(id, age);
        }

        List<String> eligibleVoters = votersList(people);
        System.out.println("Eligible Voter IDs: " + eligibleVoters);
        scanner.close();
    }

    static List<String> votersList(Map<String, Integer> people) {
        List<String> eligibleIds = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            if (entry.getValue() > 18) {
                eligibleIds.add(entry.getKey());
            }
        }
        return eligibleIds;
    }
}

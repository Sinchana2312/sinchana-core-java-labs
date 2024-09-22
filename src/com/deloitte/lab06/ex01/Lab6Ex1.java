package com.deloitte.lab06.ex01;

import java.util.*;

public class Lab6Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        System.out.println("Enter the number of entries:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine(); 
            map.put(name, age);
        }

        List<Integer> sortedValues = getValues(map);
        System.out.println("Sorted values: " + sortedValues);

        sc.close();
    }

    static List<Integer> getValues(HashMap<String, Integer> map) {
        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values);
        return values;
    }
}

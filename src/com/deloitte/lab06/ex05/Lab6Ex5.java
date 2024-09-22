package com.deloitte.lab06.ex05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab6Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int secondSmallest = getSecondSmallest(arr);
        System.out.println("The second smallest element is: " + secondSmallest);
        scanner.close();
    }

    static int getSecondSmallest(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        Collections.sort(list);
        return list.get(1);
    }
}

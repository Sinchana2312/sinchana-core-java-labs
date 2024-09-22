package com.deloitte.lab06.ex03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab6Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int len = scanner.nextInt();
        int[] numbers = new int[len];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < len; i++) {
            numbers[i] = scanner.nextInt();
        }

        Map<Integer, Integer> squaresMap = getSquares(numbers);
        System.out.println("Number and their squares: " + squaresMap);
        
        scanner.close();
    }

    static Map<Integer, Integer> getSquares(int[] nums) {
        Map<Integer, Integer> squareMap = new HashMap<>();
        for (int num : nums) {
            squareMap.put(num, num * num);
        }
        return squareMap;
    }
}

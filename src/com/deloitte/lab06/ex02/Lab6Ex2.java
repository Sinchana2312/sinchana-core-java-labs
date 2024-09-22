package com.deloitte.lab06.ex02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab6Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character array (without spaces):");
        String input = scanner.nextLine();
        char[] charArray = input.toCharArray();
        
        Map<Character, Integer> charCountMap = countChars(charArray);
        System.out.println("Character counts: " + charCountMap);
        
        scanner.close();
    }

    static Map<Character, Integer> countChars(char[] chars) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : chars) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        return countMap;
    }
}

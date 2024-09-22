package com.deloitte.lab03.ex03;

import java.util.Scanner;

public class Lab3Ex3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        
        String result = alterString(input);
        System.out.println("Output: " + result);
        
        sc.close();
    }
    
    public static String alterString(String str) {
        StringBuilder alteredStr = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            
            if (isVowel(currChar)) {
                alteredStr.append(currChar);
            } else if (Character.isLetter(currChar)) {
                char nextChar = (char) (currChar + 1);
                
                if (isVowel(nextChar)) {
                    nextChar = (char) (nextChar + 1);
                }
                
                alteredStr.append(nextChar);
            } else {
                alteredStr.append(currChar);
            }
        }
        
        return alteredStr.toString();
    }
    
    public static boolean isVowel(char c) {
        char ch = Character.toLowerCase(c);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
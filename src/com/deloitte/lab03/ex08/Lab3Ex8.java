package com.deloitte.lab03.ex08;

import java.util.Scanner;

public class Lab3Ex8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        
        boolean isPositive = isPositiveString(input);
        if (isPositive) {
            System.out.println(input + " is a positive string.");
        } else {
            System.out.println(input + " is not a positive string.");
        }
        
        sc.close();
    }
    
    public static boolean isPositiveString(String str) {
        str = str.toUpperCase();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) > str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}

package com.deloitte.lab03.ex03;

import java.util.Scanner;

public class Lab3Ex3 {

    public static String alterString(String input) {
        StringBuilder result = new StringBuilder();
        
        for (char ch : input.toCharArray()) {
            if (isConsonant(ch)) {
                result.append((char) (ch + 1));
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }

    private static boolean isConsonant(char ch) {
        return Character.isLetter(ch) && "AEIOUaeiou".indexOf(ch) == -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String alteredString = alterString(input);
        
        System.out.println("Altered String: " + alteredString);
        
        scanner.close();
    }
}

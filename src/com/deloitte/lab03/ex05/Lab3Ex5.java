package com.deloitte.lab03.ex05;

import java.util.Scanner;

public class Lab3Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text (end input by pressing Enter twice):");
        
        StringBuilder text = new StringBuilder();
        String line;
        
        while (!(line = sc.nextLine()).isEmpty()) {
            text.append(line).append("\n");
        }

        String inputText = text.toString();
        
        int charCount = countCharacters(inputText);
        int wordCount = countWords(inputText);
        int lineCount = countLines(inputText);

        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);
        
        sc.close();
    }

    public static int countCharacters(String text) {
        return text.replace("\n", "").length();
    }

    public static int countWords(String text) {
        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    public static int countLines(String text) {
        String[] lines = text.split("\n");
        return lines.length;
    }
}

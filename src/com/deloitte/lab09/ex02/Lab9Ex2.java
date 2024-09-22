package com.deloitte.lab09.ex02;

import java.util.Scanner;

public class Lab9Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
        FormatString strformatter = (str) -> String.join(" ", str.split(""));
        
        System.out.println("Formatted string: " + strformatter.format(s));
        
        sc.close();
    }

    interface FormatString {
        String format(String str);
    }
}

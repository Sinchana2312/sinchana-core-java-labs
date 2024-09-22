package com.deloitte.lab03.ex02;

import java.util.Scanner;

public class Lab3Ex2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        
        String result = getImage(input);
        System.out.println("Output: " + result);
        
        sc.close();
    }
    
    public static String getImage(String str) {
        StringBuffer sb = new StringBuffer(str);
        String mirrorImage = sb.reverse().toString();
        return str + "|" + mirrorImage;
    }
}
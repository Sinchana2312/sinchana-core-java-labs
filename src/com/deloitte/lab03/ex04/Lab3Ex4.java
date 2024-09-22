package com.deloitte.lab03.ex04;

import java.util.Scanner;

public class Lab3Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        
        int result = modifyNumber(number);
        System.out.println("Modified number: " + result);
        
        sc.close();
    }

    public static int modifyNumber(int number) {
        String str = Integer.toString(number);
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < str.length() - 1; i++) {
            int digit1 = Character.getNumericValue(str.charAt(i));
            int digit2 = Character.getNumericValue(str.charAt(i + 1));
            sb.append(Math.abs(digit1 - digit2));
        }
        
        sb.append(str.charAt(str.length() - 1));
        return Integer.parseInt(sb.toString());
    }
}

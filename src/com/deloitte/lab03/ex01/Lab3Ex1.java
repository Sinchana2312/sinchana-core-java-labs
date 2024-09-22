package com.deloitte.lab03.ex01;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab3Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a line of integers separated by spaces:");
        String input = sc.nextLine();
        
        StringTokenizer st = new StringTokenizer(input, " ");
        
        int sum = 0;
        
        System.out.println("The integers are:");
        
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            int num = Integer.parseInt(token);
            System.out.println(num);
            sum += num;
        }
        
        System.out.println("Sum of all integers: " + sum);
        
        sc.close();
    }
}
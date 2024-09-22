package com.deloitte.lab09.ex01;

import java.util.Scanner;

public class Lab9Ex1 {
	interface Power {
        int power(int x, int y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Power p = (x, y) -> (int) Math.pow(x, y);
        
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        
        System.out.print("Enter the value of y: ");
        int y = sc.nextInt();
        
        System.out.println("The value of " + x + "^" + y + " is: " + p.power(x, y));
        
        sc.close();
    }

    
}

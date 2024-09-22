package com.deloitte.lab09.ex03;

import java.util.Scanner;

public class Lab9Ex3 {
	
	interface Authentication {
	    boolean authenticate(String username, String password);
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String Username = sc.nextLine();
        
        System.out.print("Enter password: ");
        String Password = sc.nextLine();
        
        Authentication auth = (username, password) -> username.equals("test123") && password.equals("test456");
        
        if (auth.authenticate(Username, Password)) {
            System.out.println("Authentication successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
        
        sc.close();
    }

   
}

package com.deloitte.lab01.ex07;
import java.util.Scanner;

public class Lab1Ex7{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		String num = sc.nextLine();
		 if (!num.matches("\\d+")) {
	            System.out.println("Invalid input! Please enter a positive integer.");
	        } else {
	            if (checkNumber(num)) {
	                System.out.println("The given number is an increasing number.");
	            } else {
	                System.out.println("The given number is not an increasing number.");
	            }
	        }
		
		sc.close();
		
	}
	
	static boolean checkNumber(String num)
	{
		for(int i=0;i<num.length()-1;i++)
		{
			if(num.charAt(i)>num.charAt(i+1))
				return false;
		}
		return true;
	}
}
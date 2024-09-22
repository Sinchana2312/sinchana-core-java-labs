package com.deloitte.lab01.ex08;

import java.util.Scanner;

public class Lab1Ex8{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		if(checkNum(n))
		{
			System.out.println("The given number "+n+" is a power of 2");
		}
		else
		{
			System.out.println("The given number "+n+" is not a power of 2");
		}
		sc.close();
	}
	static boolean checkNum(int n)
	{	
		if(n<2)
		{
			return false;
		}
		while(n%2==0)
		{
			n=n/2;
		}
		if(n==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
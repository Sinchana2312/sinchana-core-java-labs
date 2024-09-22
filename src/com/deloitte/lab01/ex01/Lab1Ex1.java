package com.deloitte.lab01.ex01;
import java.util.Scanner;
public class Lab1Ex1{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum = sumOfCubesOfDigits(n);
		System.out.println("The sum of the cubes of the given number is "+sum);
		sc.close();
	}
	
	public static int sumOfCubesOfDigits(int n)
	{	int k=n;
		int sum = 0;
		int remainder=0;
		do
		{
			remainder=k%10;
			sum += remainder*remainder*remainder;
			k=k/10;
			
			
		}while(k!=0);
		
		return sum;
	}
	
	
}
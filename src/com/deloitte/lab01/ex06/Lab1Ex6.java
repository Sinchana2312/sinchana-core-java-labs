package com.deloitte.lab01.ex06;
import java.util.Scanner;


public class Lab1Ex6{ 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("The difference between the sum of squares and square of sum "
				+ "of the numbers "+n+" is "+calculateDifference(n));
		sc.close();
	}
	static int calculateDifference(int n)
	{
		int sumOfSquares = 0;
		int sumOfNumbers = 0;
		for(int i=1;i<=n;i++)
		{
			sumOfSquares += (i*i);
			sumOfNumbers += i;
		}
		
		int sum = (int) (Math.pow(sumOfNumbers,2)-sumOfSquares);
		
		return Math.abs(sum);
	}
}
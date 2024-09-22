package com.deloitte.lab01.ex05;
import java.util.Scanner;
public class Lab1Ex5{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("The sum of 1st "+num+" natural numbers divisible by 3 or 5 are "+calculateSum(num));
		sc.close();
	}
	//Calculate Sum
	public static int calculateSum(int n)
	{ 
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum+=i;
			}
		}
		return sum;
		
	}
}
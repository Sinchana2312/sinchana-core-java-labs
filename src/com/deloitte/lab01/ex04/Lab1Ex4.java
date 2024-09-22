package com.deloitte.lab01.ex04;
import java.util.Scanner;

public class Lab1Ex4{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		int n = sc.nextInt();
		if(n<2)
		{
			System.out.println("There are no prime numbers");
		}
		else
		{
			System.out.println("The prime number upto "+ n +" are:");
			
			if(n>=2)
			{
				System.out.println(2);
			}
			for(int i=3;i<=n;i++)
			{
				boolean isPrime = true;
				for(int j=2;j<=Math.sqrt(i);j++)
				{
					if(i%j==0)
					{
						isPrime=false;
						break;
					}
				}
				if(isPrime)
				{
					System.out.println(i);
				}
			}
		}
		
		sc.close();
		
	}
}
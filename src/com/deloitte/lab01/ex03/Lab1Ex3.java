package com.deloitte.lab01.ex03;
import java.util.Scanner;
public class Lab1Ex3{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value n to find the nth Fibonacci number");
		int n = sc.nextInt();
		
		System.out.println("The "+ n +"th Fibonacci number using recursive method is "+fibonacciRecursive(n));
		System.out.println("The "+ n +"th Fibonacci number using iterative method is "+fibonacciIterative(n));
		
		sc.close();
		
	}
	public static int fibonacciRecursive(int n)
	{	if(n==0)
		{
			return 0;
		}
		else if(n==1 || n==2)
		{
			return 1;
		}
		else
		{
			return (fibonacciRecursive(n-1)+fibonacciRecursive(n-2));
		}
		
	}
	
	public static int fibonacciIterative(int n)
	{ int nth=0;
		int previous=1;
		int current=1;
		
		if(n==0)
		{
			return 0;
		}
		else if(n==1 || n==2)
		{
			return 1;
		}
		else {
		for(int i=3;i<=n;i++) {
			nth=previous+current;
			
			previous=current;
			current=nth;
		}
		return nth;
		}
	}
}
package com.deloitte.lab02.ex01;
import java.util.Scanner;
import java.util.Arrays;

public class Lab2Ex1{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in an array");
		int n = sc.nextInt();
		
		if (n < 2)
		{
			System.out.println("Array must have at least 2 elements to find the second smallest value.");
	        sc.close();
	        return;
	    }
		int arr[]= new int[n];
		
		System.out.println("Enter the elements of the array");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int secondSmallest= getSecondSmallest(arr);
	
		if(secondSmallest!=Integer.MIN_VALUE) {
		System.out.println("The second smallest element in an array is "+secondSmallest);
		}
		else
		{
			System.out.println("There is no second smallest element in the given array as all elements of the array are same");
		}
		sc.close();
	}
	
	static int getSecondSmallest(int arr[])
	{
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				return arr[i+1];
			}
		}
		return Integer.MIN_VALUE;
	}
}
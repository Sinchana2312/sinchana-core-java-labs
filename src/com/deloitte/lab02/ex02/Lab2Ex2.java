package com.deloitte.lab02.ex02;
import java.util.Scanner;
import java.util.Arrays;

public class Lab2Ex2{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of string objects");
		int len = sc.nextInt();
	    sc.nextLine(); 
		String str [] = new String[len];
		
		System.out.println("Enter the elements of the String array");
		for(int i=0; i<len;i++)
		{
			str[i]=sc.nextLine();
		}
		
		str = sortStrings(str);
		System.out.println("The elements of the string array after sorting and converting 1st half to upper and remaining to lower is ");
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
		sc.close();
		
	}
	
	static String[] sortStrings(String[] str)
	{
        Arrays.sort(str);
        int midpoint = (str.length + 1) / 2; 

        for (int i = 0; i < midpoint; i++) {
            str[i] = str[i].toUpperCase(); 
        }
        for (int i = midpoint; i < str.length; i++) {
            str[i] = str[i].toLowerCase(); 
        }

        return str;

	}
}
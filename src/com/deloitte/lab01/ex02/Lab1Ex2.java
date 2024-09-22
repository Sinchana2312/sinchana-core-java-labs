 package com.deloitte.lab01.ex02;
 
 import java.util.Scanner;
 
 public class Lab1Ex2{
	 public static void main(String[] args)
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Please choose the traffic light colour by entering the corresponding number");
		 System.out.println("1. red");
		 System.out.println("2. yellow");
		 System.out.println("3. green");
		 
		 int choice = sc.nextInt();
		 
		 switch(choice) {
		 case 1: System.out.println("Red Light: Stop");
		 		 break;
		 case 2: System.out.println("Yellow Light: ready");
 		 		 break;
		 case 3: System.out.println("Green Light: go");
		 		 break;
		 default: System.out.println("Enter the valid number 1 for red, 2 for yellow and 3 for green");
		 }
		 
		 sc.close();
	 }
 }
package com.deloitte.lab02.ex03;
import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int len = sc.nextInt();
        int arr[] = new int[len];
        
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        
        arr = getSorted(arr);
        System.out.println("The elements of the array after reversing the numbers and sorting the resulting array are:");
        for (int x : arr) {
            System.out.println(x);
        }
        
        sc.close();
    }

    static int[] getSorted(int arr[]) {
      
        for (int i = 0; i < arr.length; i++) {
           
            arr[i] = Integer.parseInt(new StringBuilder(String.valueOf(arr[i])).reverse().toString());
        }
        
    
        Arrays.sort(arr);
        
        return arr;
    }
}
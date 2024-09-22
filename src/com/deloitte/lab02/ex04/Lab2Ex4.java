package com.deloitte.lab02.ex04;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter the elements of the array");
        
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        int[] modifiedArray = modifyArray(arr);
        System.out.println("Array after removing duplicates and sorting in descending order:");
        for(int x:modifiedArray)
        {
        	System.out.println(x);
        }
        
        sc.close();
    }

    static int[] modifyArray(int arr[]) {
       
        int[] temp = new int[arr.length];
        int index = 0;

        
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
      
            if (!isDuplicate) {
                temp[index++] = arr[i];
            }
        }

        int[] uniqueArray = Arrays.copyOf(temp, index);
        Arrays.sort(uniqueArray);
        int sortedDesc [] = new int[index];
        int j=0;
        for(int i=index-1;i>=0;i--)
        {
        	sortedDesc[j]=uniqueArray[i];
        	j++;
        }
        return sortedDesc;
    }
}
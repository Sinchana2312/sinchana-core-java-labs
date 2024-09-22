package com.deloitte.lab03.ex09;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab3Ex9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date in the format YYYY-MM-DD:");
        String inputDate = sc.nextLine();
        
        LocalDate givenDate = LocalDate.parse(inputDate);
        LocalDate currentDate = LocalDate.now();
        
        Period period = Period.between(givenDate, currentDate);
        
        System.out.println("Duration: " + Math.abs(period.getYears()) + " years, " 
                + Math.abs(period.getMonths()) + " months, " 
                + Math.abs(period.getDays()) + " days");
        
        sc.close();
    }
}

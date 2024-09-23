package com.deloitte.lab04.ex02.service;

import com.deloitte.lab04.ex02.bean.Employee;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
 @Override
 public Employee getEmployeeDetails() {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter Employee ID: ");
     int id = scanner.nextInt();
     scanner.nextLine();  // Consume the newline character
     System.out.print("Enter Employee Name: ");
     String name = scanner.nextLine();
     System.out.print("Enter Employee Salary: ");
     double salary = scanner.nextDouble();
     scanner.nextLine();  // Consume the newline character
     System.out.print("Enter Employee Designation: ");
     String designation = scanner.nextLine();

     return new Employee(id, name, salary, designation);
 }

 @Override
 public void displayEmployeeDetails(Employee employee) {
     System.out.println(employee);
 }
}

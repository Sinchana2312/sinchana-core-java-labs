package com.deloitte.lab04.ex02.com.cg.eis.service;

import com.deloitte.lab04.ex02.com.cg.eis.bean.Employee;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public Employee getEmployeeDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee ID:");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.println("Enter Employee Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Employee Salary:");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.println("Enter Employee Designation:");
        String designation = scanner.nextLine();

        Employee employee = new Employee(id, name, salary, designation);
        employee.setInsuranceScheme(findInsuranceScheme(salary, designation));

        return employee;
    }

    @Override
    public String findInsuranceScheme(double salary, String designation) {
        if (salary > 50000 && designation.equalsIgnoreCase("Manager")) {
            return "Scheme A";
        } else if (salary >= 20000 && salary <= 50000 && designation.equalsIgnoreCase("Programmer")) {
            return "Scheme B";
        } else if (salary >= 5000 && salary < 20000 && designation.equalsIgnoreCase("Clerk")) {
            return "Scheme C";
        } else {
            return "No Scheme";
        }
    }

    @Override
    public void displayEmployeeDetails(Employee employee) {
        System.out.println(employee);
    }
}

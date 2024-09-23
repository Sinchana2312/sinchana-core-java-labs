package com.deloitte.lab04.ex02.bean;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String designation;
    private String insuranceScheme;

    public Employee(int id, String name, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.insuranceScheme = determineInsuranceScheme();
    }

    public String getInsuranceScheme() {
        return insuranceScheme;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + 
               ", Designation=" + designation + ", Insurance Scheme=" + insuranceScheme + "]";
    }

    private String determineInsuranceScheme() {
        if (salary < 5000) {
            return "No Scheme";
        } else if (salary < 20000) {
            return "Scheme C";
        } else if (salary < 40000) {
            return "Scheme B";
        } else {
            return "Scheme A";
        }
    }
}

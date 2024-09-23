package com.deloitte.lab04.ex02.pl;

import com.deloitte.lab04.ex02.bean.Employee;
import com.deloitte.lab04.ex02.service.EmployeeService;
import com.deloitte.lab04.ex02.service.EmployeeServiceImpl;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeServiceImpl();

        Employee employee = employeeService.getEmployeeDetails();

        employeeService.displayEmployeeDetails(employee);
    }
}

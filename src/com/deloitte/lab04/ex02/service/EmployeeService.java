package com.deloitte.lab04.ex02.service;

import com.deloitte.lab04.ex02.bean.Employee;

public interface EmployeeService {
    Employee getEmployeeDetails();
    void displayEmployeeDetails(Employee employee);
}

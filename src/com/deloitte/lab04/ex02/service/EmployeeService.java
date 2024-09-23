package com.deloitte.lab04.ex04.service;

import com.deloitte.lab04.ex04.bean.Employee;

public interface EmployeeService {
    Employee getEmployeeDetails();
    void displayEmployeeDetails(Employee employee);
}

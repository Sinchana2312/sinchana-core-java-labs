
package com.deloitte.lab04.ex02.com.cg.eis.pl;

import com.deloitte.lab04.ex02.com.cg.eis.bean.Employee;
import com.deloitte.lab04.ex02.com.cg.eis.service.EmployeeService;
import com.deloitte.lab04.ex02.com.cg.eis.service.EmployeeServiceImpl;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeServiceImpl();
        
        Employee employee = employeeService.getEmployeeDetails();
        employeeService.displayEmployeeDetails(employee);
    }
}

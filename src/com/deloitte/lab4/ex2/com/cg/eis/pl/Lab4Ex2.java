package com.deloitte.lab4.ex2.com.cg.eis.pl;

import com.deloitte.lab4.ex2.com.cg.eis.service.EmployeeService;
import com.deloitte.lab4.ex2.com.cg.eis.service.EmployeeServiceImpl;

public class Lab4Ex2 {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeServiceImpl();
        service.getEmployeeDetails();
    }
}

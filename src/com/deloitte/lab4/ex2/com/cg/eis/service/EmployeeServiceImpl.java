package com.deloitte.lab4.ex2.com.cg.eis.service;

import com.deloitte.lab4.ex2.com.cg.eis.bean.Employee;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void getEmployeeDetails() {
        // Implementation for getting employee details
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Enter Designation: ");
        String designation = scanner.nextLine();

        System.out.print("Enter Insurance Scheme: ");
        String insuranceScheme = scanner.nextLine();

        Employee emp = new Employee(id, name, salary, designation, insuranceScheme);
        findInsuranceScheme(emp);
        displayEmployeeDetails(emp);
    }

    @Override
    public void findInsuranceScheme(Employee emp) {
        // Implementation to determine insurance scheme
        if (emp.getSalary() > 50000) {
            emp.setInsuranceScheme("Premium");
        } else if (emp.getSalary() > 30000) {
            emp.setInsuranceScheme("Standard");
        } else {
            emp.setInsuranceScheme("Basic");
        }
    }

    @Override
    public void displayEmployeeDetails(Employee emp) {
        // Implementation to display employee details
        System.out.println("Employee Details:");
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Designation: " + emp.getDesignation());
        System.out.println("Insurance Scheme: " + emp.getInsuranceScheme());
    }
}

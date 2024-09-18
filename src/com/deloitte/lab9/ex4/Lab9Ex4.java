package com.deloitte.lab9.ex4;

public class Lab9Ex4 {

    // Functional interface to create an Employee instance
    @FunctionalInterface
    interface EmployeeFactory {
        Employee create(String name, int id);
    }

    public static void main(String[] args) {
  
        EmployeeFactory factory = Employee::new;

        // Example 
        Employee emp = factory.create("Parth Chavan", 1032202115);
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getId());
    }
}


class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

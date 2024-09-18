package com.deloitte.lab5.ex3;

public class Lab5Ex3 {

    // Method to validate employee salary
    public static void validateSalary(double salary) throws EmployeeException {
        if (salary < 3000) {
            throw new EmployeeException("Salary cannot be below 3000.");
        } else {
            System.out.println("Valid salary: " + salary);
        }
    }

    public static void main(String[] args) {
        try {
            double salary = 2500; // Salary below 3000
            validateSalary(salary);
        } catch (EmployeeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

//Custom exception class for salary validation
class EmployeeException extends Exception {
	public EmployeeException(String message) {
		super(message);
	}
}

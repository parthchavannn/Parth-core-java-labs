package com.deloitte.lab5.ex1;

public class Lab5Ex1 {
    
    // Method to validate age
    public static void validateAge(int age) throws AgeException {
        if (age <= 15) {
            throw new AgeException("Age must be above 15.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            int age = 14; // Age below 15
            validateAge(age);
        } catch (AgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

//Custom exception class for age validation
class AgeException extends Exception {
	public AgeException(String message) {
		super(message);
	}
}

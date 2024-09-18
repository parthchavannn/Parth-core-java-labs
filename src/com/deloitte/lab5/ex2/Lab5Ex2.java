package com.deloitte.lab5.ex2;

public class Lab5Ex2 {

    // Method to validate full name
    public static void validateName(String firstName, String lastName) throws NameException {
        if (firstName == null || firstName.trim().isEmpty() || lastName == null || lastName.trim().isEmpty()) {
            throw new NameException("First name or Last name cannot be blank.");
        } else {
            System.out.println("Valid full name: " + firstName + " " + lastName);
        }
    }

    public static void main(String[] args) {
        try {
            String firstName = ""; // Blank first name
            String lastName = "Smith"; 
            validateName(firstName, lastName);
        } catch (NameException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

//Custom exception class for name validation
class NameException extends Exception {
	public NameException(String message) {
		super(message);
	}
}

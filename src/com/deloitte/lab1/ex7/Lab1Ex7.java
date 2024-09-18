package com.deloitte.lab1.ex7;

public class Lab1Ex7 {

    // Method to check if a number is an increasing number
    public static boolean checkNumber(int number) {
        // Start by extracting the last digit
        int previousDigit = number % 10;
        number /= 10;

        // Loop through the digits of the number from right to left
        while (number > 0) {
            int currentDigit = number % 10; 
            if (currentDigit > previousDigit) {
                return false; // If a digit is greater than the one on its right, it's not increasing
            }
            previousDigit = currentDigit; 
            number /= 10;
        }

        return true; // If no digit breaks the increasing rule, return true
    }

    public static void main(String[] args) {
        int number = 134468;
        boolean result = checkNumber(number);

        if (result) {
            System.out.println(number + " is an increasing number.");
        } else {
            System.out.println(number + " is not an increasing number.");
        }
    }
}

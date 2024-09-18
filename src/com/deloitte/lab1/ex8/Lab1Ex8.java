package com.deloitte.lab1.ex8;

public class Lab1Ex8 {

    // Method to check if a number is a power of two (using bitwise operation)
    public static boolean checkNumber(int n) {
        // Check if n is greater than 0 and n & (n - 1) equals 0
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int number = 8;
        boolean result = checkNumber(number);

        if (result) {
            System.out.println(number + " is a power of 2.");
        } else {
            System.out.println(number + " is not a power of 2.");
        }
    }
}

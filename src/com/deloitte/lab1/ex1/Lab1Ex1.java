package com.deloitte.lab1.ex1;

public class Lab1Ex1 {

    // Method to calculate the sum of cubes of digits of a number
    public static int sumOfCubes(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            sum += Math.pow(digit, 3); // Cube the digit and add to sum
            number /= 10; // Remove the last digit from the number
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 29; // Example
        int result = sumOfCubes(number);
        System.out.println("The sum of cubes of the digits of " + number + " is: " + result);
    }
}

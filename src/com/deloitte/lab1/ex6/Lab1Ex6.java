package com.deloitte.lab1.ex6;

public class Lab1Ex6 {

    // Method to calculate the difference between the sum of the squares and the square of the sum
    public static int calculateDifference(int n) {
        int sumOfSquares = 0; 
        int sum = 0; 

        // Calculate the sum of squares and the sum of natural numbers
        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;
            sum += i;
        }

        // Calculate the square of the sum
        int squareOfSum = sum * sum;

        // Calculate the difference
        return sumOfSquares - squareOfSum;
    }

    public static void main(String[] args) {
        int n = 10;
        int result = calculateDifference(n);
        System.out.println("The difference is: " + result);
    }
}

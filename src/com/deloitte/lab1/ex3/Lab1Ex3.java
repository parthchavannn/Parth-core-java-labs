package com.deloitte.lab1.ex3;

import java.util.Scanner;

public class Lab1Ex3 {

    // Recursive method to find the nth Fibonacci number
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Non-recursive (iterative) method to find the nth Fibonacci number
    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int fib1 = 0, fib2 = 1, fibN = 1;
        for (int i = 2; i <= n; i++) {
            fibN = fib1 + fib2; 
            fib1 = fib2;  
            fib2 = fibN;  
        }
        return fibN;
    }

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the position of Fibonacci number to be calculated (n): ");
        int n = scanner.nextInt();

        // Calculate using the recursive method
        int fibRecursive = fibonacciRecursive(n);
        System.out.println("Fibonacci number at position " + n + " (Recursive): " + fibRecursive);

        // Calculate using the non-recursive (iterative) method
        int fibIterative = fibonacciIterative(n);
        System.out.println("Fibonacci number at position " + n + " (Non-recursive): " + fibIterative);

        scanner.close();
    }
}

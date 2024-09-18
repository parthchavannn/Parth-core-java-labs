package com.deloitte.lab9.ex5;

public class Lab9Ex5 {

    public static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    // Functional interface for factorial calculation
    @FunctionalInterface
    interface FactorialCalculator {
        long calculate(int num);
    }

    public static void main(String[] args) {
     
        FactorialCalculator calculator = Lab9Ex5::factorial;

        // Example
        int number = 5;
        long result = calculator.calculate(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}

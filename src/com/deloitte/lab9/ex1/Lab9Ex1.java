package com.deloitte.lab9.ex1;

public class Lab9Ex1 {

    // Functional interface for power calculation
    @FunctionalInterface
    interface Power {
        double calculate(double x, double y);
    }

    public static void main(String[] args) {
        // Lambda expression for calculating x^y
        Power power = (x, y) -> Math.pow(x, y);

        // Example
        double result = power.calculate(2, 4); 
        System.out.println("2^4 = " + result);
    }
}

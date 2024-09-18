package com.deloitte.lab9.ex2;

public class Lab9Ex2 {

    // Functional interface for string formatting
	@FunctionalInterface
    interface StringFormatter {
        String format(String str);
    }

    public static void main(String[] args) {
        // Lambda expression to insert spaces between each character
        StringFormatter formatter = str -> String.join(" ", str.split(""));

        // Example
        String formattedString = formatter.format("PARTH");
        System.out.println("Formatted String: " + formattedString);
    }
}

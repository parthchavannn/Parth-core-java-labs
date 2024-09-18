package com.deloitte.lab3.ex8;

public class Lab3Ex8 {
    
    public static boolean isPositiveString(String input) {
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) <= input.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "PARTH"; // Example
        boolean result = isPositiveString(input);
        System.out.println("Is the string positive? " + result);
    }
}

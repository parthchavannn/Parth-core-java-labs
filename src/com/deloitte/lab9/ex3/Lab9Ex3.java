package com.deloitte.lab9.ex3;

public class Lab9Ex3 {

    // Functional interface for authentication
    @FunctionalInterface
    interface Authenticator {
        boolean authenticate(String username, String password);
    }

    public static void main(String[] args) {
        // Predefined
        String validUsername = "admin";
        String validPassword = "password29";

        // Lambda expression for authentication
        Authenticator auth = (username, password) -> 
                username.equals(validUsername) && password.equals(validPassword);

        // Example
        boolean isAuthenticated = auth.authenticate("admin", "password10");
        System.out.println("Authentication successful: " + isAuthenticated);
    }
}

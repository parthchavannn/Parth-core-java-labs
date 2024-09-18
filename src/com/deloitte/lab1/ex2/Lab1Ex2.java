package com.deloitte.lab1.ex2;

import java.util.Scanner;

public class Lab1Ex2 {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.println("Traffic Light Simulator");
        System.out.println("Enter 1 for Red, 2 for Yellow, or 3 for Green:");

        int choice = scanner.nextInt();

        // Check the user's input and display the corresponding message
        switch (choice) {
            case 1:
                System.out.println("Stop");
                break;
            case 2:
                System.out.println("Ready");
                break;
            case 3:
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid input! Please enter 1, 2, or 3.");
                break;
        }
        scanner.close();
    }
}

package com.deloitte.lab2.ex1;

import java.util.Arrays;

public class Lab2Ex1 {

    // Method to get the second smallest element in the array
    public static int getSecondSmallest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        // Sort the array
        Arrays.sort(arr);

        // Return the second element (index 1) in the sorted array
        return arr[1];
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 3, 9};
        int secondSmallest = getSecondSmallest(arr);

        System.out.println("The second smallest element in the array is: " + secondSmallest);
    }
}

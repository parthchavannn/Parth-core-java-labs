package com.deloitte.lab2.ex2;

import java.util.Arrays;

public class Lab2Ex2 {

    public static String[] sortStrings(String[] arr) {
        // Sort the array in alphabetical order
        Arrays.sort(arr);

        // Find the middle point
        int n = arr.length;
        int midpoint = (n % 2 == 0) ? n / 2 : (n / 2) + 1;

        // Convert the left half to uppercase
        for (int i = 0; i < midpoint; i++) {
            arr[i] = arr[i].toUpperCase();
        }

        // Convert the right half to lowercase
        for (int i = midpoint; i < n; i++) {
            arr[i] = arr[i].toLowerCase();
        }

        return arr;
    }

    public static void main(String[] args) {
        
        String[] arr = {"apple", "Orange", "banana", "grape", "Mango"}; 
        String[] sortedArr = sortStrings(arr);
        System.out.println("Sorted and modified array: " + Arrays.toString(sortedArr));
    }
}

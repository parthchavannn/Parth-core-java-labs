package com.deloitte.lab2.ex3;

import java.util.Arrays;

public class Lab2Ex3 {

    // Method to reverse the digits of each number in the array and return the sorted array
    public static int[] getSorted(int[] arr) {
        // Reverse the digits of each number in the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverseNumber(arr[i]);
        }

        // Sort the array after reversing the numbers
        Arrays.sort(arr);

        return arr;
    }

    // Helper method to reverse the digits of a number
    private static int reverseNumber(int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        sb.reverse(); 
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        
        int[] arr = {123, 456, 789, 321}; 
        int[] sortedArr = getSorted(arr);

        System.out.println("Sorted array after reversing digits: " + Arrays.toString(sortedArr));
    }
}

package com.deloitte.lab2.ex4;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;

public class Lab2Ex4 {

    // Method to remove duplicates and sort the array in descending order
    public static int[] modifyArray(int[] arr) {
        // Remove duplicates using a TreeSet (which sorts elements by default)
        Set<Integer> uniqueSet = new TreeSet<>(Collections.reverseOrder());

        for (int num : arr) {
            uniqueSet.add(num);
        }

        int[] resultArray = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            resultArray[index++] = num;
        }

        return resultArray; 
    }

    public static void main(String[] args) {
    
        int[] arr = {5, 12, 7, 5, 3, 9, 12}; 
        int[] modifiedArr = modifyArray(arr);
        System.out.println("Array after removing duplicates and sorting in descending order: " + Arrays.toString(modifiedArr));
    }
}

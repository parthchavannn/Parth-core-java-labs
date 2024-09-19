package com.deloitte.lab6.ex7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lab6Ex7 {

    public static void main(String[] args) {
        int[] numbers = {123, 456, 789}; // Example input
        int[] sortedArray = getSorted(numbers);
        System.out.println("Sorted array after reversing digits: " + Arrays.toString(sortedArray));
    }

    public static int[] getSorted(int[] array) {
        // Convert the array to a list of reversed integers
        List<Integer> reversedList = Arrays.stream(array)
            .mapToObj(num -> reverseNumber(num)) 
            .sorted() 
            .collect(Collectors.toList()); 
        
        // Convert the list back to an array
        return reversedList.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }

    private static int reverseNumber(int num) {
        
        String numStr = Integer.toString(num);
        String reversedStr = new StringBuilder(numStr).reverse().toString();
        return Integer.parseInt(reversedStr);
    }
}

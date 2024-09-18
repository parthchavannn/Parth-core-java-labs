package com.deloitte.lab6.ex3;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex3 {

    public static Map<Integer, Integer> getSquares(int[] arr) {
        Map<Integer, Integer> squaresMap = new HashMap<>();

        for (int num : arr) {
            squaresMap.put(num, num * num);
        }

        return squaresMap;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5};
        Map<Integer, Integer> result = getSquares(numbers);
        System.out.println(result);
    }
}

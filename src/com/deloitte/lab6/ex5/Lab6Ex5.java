package com.deloitte.lab6.ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab6Ex5 {

    public static int getSecondSmallest(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        Collections.sort(list);
        return list.get(1); // Return the second smallest element
    }

    public static void main(String[] args) {
        int[] numbers = {12, 5, 7, 19, 23};
        int secondSmallest = getSecondSmallest(numbers);
        System.out.println("Second smallest element: " + secondSmallest);
    }
}

package com.deloitte.lab6.ex1;

import java.util.*;

public class Lab6Ex1 {
    public static List<Integer> getValues(HashMap<Integer, Integer> map) {
        List<Integer> valuesList = new ArrayList<>(map.values());
        Collections.sort(valuesList);
        return valuesList;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 50);
        map.put(2, 20);
        map.put(3, 30);

        List<Integer> sortedValues = getValues(map);
        System.out.println(sortedValues);
    }
}

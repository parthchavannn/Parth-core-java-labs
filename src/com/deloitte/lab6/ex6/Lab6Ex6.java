package com.deloitte.lab6.ex6;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab6Ex6 {

    public static List<Integer> votersList(Map<Integer, LocalDate> people) {
        List<Integer> eligibleVoters = new ArrayList<>();

        for (Map.Entry<Integer, LocalDate> entry : people.entrySet()) {
            int age = Period.between(entry.getValue(), LocalDate.now()).getYears();
            if (age >= 18) {
                eligibleVoters.add(entry.getKey());
            }
        }

        return eligibleVoters;
    }

    public static void main(String[] args) {
        Map<Integer, LocalDate> people = new HashMap<>();
        people.put(101, LocalDate.of(2010, 9, 12));
        people.put(102, LocalDate.of(1998, 3, 15));
        people.put(103, LocalDate.of(2003, 8, 22));

        List<Integer> eligibleVoters = votersList(people);
        System.out.println("Eligible voters: " + eligibleVoters);
    }
}

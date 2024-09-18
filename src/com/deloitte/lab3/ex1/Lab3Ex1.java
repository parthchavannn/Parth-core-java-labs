package com.deloitte.lab3.ex1;

import java.util.StringTokenizer;

public class Lab3Ex1 {
    public static void main(String[] args) {
        String input = "10 20 30 40 50";
        StringTokenizer tokenizer = new StringTokenizer(input);
        int sum = 0;

        while (tokenizer.hasMoreTokens()) {
            int number = Integer.parseInt(tokenizer.nextToken());
            System.out.println("Number: " + number);
            sum += number;
        }

        System.out.println("Sum of all integers: " + sum);
    }
}

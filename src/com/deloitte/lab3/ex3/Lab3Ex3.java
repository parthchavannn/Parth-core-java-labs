package com.deloitte.lab3.ex3;

public class Lab3Ex3 {
    
    public static String alterString(String input) {
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (isConsonant(ch)) {
                // Replace consonant with next character
                result.append((char) (ch + 1));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    private static boolean isConsonant(char ch) {
        return ch >= 'a' && ch <= 'z' && !isVowel(ch) || ch >= 'A' && ch <= 'Z' && !isVowel(ch);
    }

    private static boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        String input = "WATER";
        String result = alterString(input);
        System.out.println(result);
    }
}

package com.deloitte.lab3.ex4;

public class Lab3Ex4 {
    
    public static int modifyNumber(int number) {
        String numStr = Integer.toString(number);
        StringBuilder modifiedStr = new StringBuilder();

        for (int i = 0; i < numStr.length() - 1; i++) {
            int diff = Math.abs(numStr.charAt(i) - numStr.charAt(i + 1));
            modifiedStr.append(diff);
        }
        // Add the last digit as it is
        modifiedStr.append(numStr.charAt(numStr.length() - 1));

        return Integer.parseInt(modifiedStr.toString());
    }

    public static void main(String[] args) {
        int number = 29052; // Example
        int result = modifyNumber(number);
        System.out.println("Modified number: " + result);
    }
}

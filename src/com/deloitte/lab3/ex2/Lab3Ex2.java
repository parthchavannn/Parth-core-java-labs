package com.deloitte.lab3.ex2;

public class Lab3Ex2 {
    
    public static String getImage(String input) {
        StringBuffer sb = new StringBuffer(input);
        String mirrorImage = sb.reverse().toString();
        return input + "|" + mirrorImage;
    }

    public static void main(String[] args) {
        String input = "PARTH"; 
        String result = getImage(input);
        System.out.println(result);
    }
}

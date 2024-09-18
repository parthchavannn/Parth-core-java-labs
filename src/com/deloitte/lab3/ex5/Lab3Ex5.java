package com.deloitte.lab3.ex5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lab3Ex5 {

    public static void main(String[] args) {
        String filePath = "D:\\Deloitte USI\\DeloitteJava\\Parth_core_java_labs\\src\\com\\deloitte\\lab3\\ex5\\demo.txt";  // Specify the path to the file
        countFileContents(filePath);
    }

    public static void countFileContents(String filePath) {
        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;

                // Count characters
                characterCount += line.length(); 

                // Count words
                String[] words = line.split("\\s+"); 
                wordCount += words.length;
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        // Display the counts
        System.out.println("Number of characters: " + characterCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);
    }
}

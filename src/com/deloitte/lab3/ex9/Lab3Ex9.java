package com.deloitte.lab3.ex9;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab3Ex9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the date (yyyy-mm-dd): ");
        String inputDate = scanner.nextLine();
        LocalDate givenDate = LocalDate.parse(inputDate);
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(givenDate, currentDate);

        System.out.println("Duration from the given date to today:");
        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());

        scanner.close();
    }
}

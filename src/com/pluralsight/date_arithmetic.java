package com.pluralsight;

import java.time.LocalDate;
import java.util.Scanner;

public class date_arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (yyyy-MM-dd): ");
        String date = sc.nextLine(); // e.g. 2026-04-08
        LocalDate startDate = LocalDate.parse(date);

        System.out.print("Enter number of days to add: ");
        int daysToAdd = sc.nextInt();

        LocalDate newDate = startDate.plusDays(daysToAdd);

        String output = String.format("%s plus %d days is %s", startDate, daysToAdd, newDate);
        System.out.println(output);
    }
}
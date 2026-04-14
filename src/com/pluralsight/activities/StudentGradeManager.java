package com.pluralsight.activities;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeManager {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> names = new ArrayList<>();
    static ArrayList<Double> grades = new ArrayList<>();
    static boolean exit = false;

    public static void main(String[] args) {

        while (!exit) {
            menu();
            choice();
        }

        System.out.println("Program exited. Goodbye!");
    }

    static void addStudent() {
        System.out.print("Enter the student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the student grade: ");
        double grade = scanner.nextDouble();
        scanner.nextLine(); // clear buffer

        names.add(name);
        grades.add(grade);

        System.out.println("Student added successfully!");
    }

    static void viewStudents() {
        if (names.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n--- Student List ---");
        for (int i = 0; i < names.size(); i++) {
            System.out.println((i + 1) + ". Name: " + names.get(i) +
                    " | Grade: " + grades.get(i));
        }
    }

    static void calcAverage() {
        if (grades.isEmpty()) {
            System.out.println("No grades available.");
            return;
        }

        double total = 0;
        for (double grade : grades) {
            total += grade;
        }

        double average = total / grades.size();
        System.out.println("Average grade: " + average);
    }

    static void findTopStudent() {
        if (grades.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        int topIndex = 0;

        for (int i = 1; i < grades.size(); i++) {
            if (grades.get(i) > grades.get(topIndex)) {
                topIndex = i;
            }
        }

        System.out.println("Top Student:");
        System.out.println("Name: " + names.get(topIndex) +
                " | Grade: " + grades.get(topIndex));
    }

    static void menu() {
        System.out.println("\n=== Student Grade Manager ===");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Calculate Average");
        System.out.println("4. Find Top Student");
        System.out.println("5. Exit");
    }

    static void choice() {
        System.out.print("Enter a choice: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a number.");
            scanner.nextLine();
            return;
        }

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> addStudent();
            case 2 -> viewStudents();
            case 3 -> calcAverage();
            case 4 -> findTopStudent();
            case 5 -> exit = true;
            default -> System.out.println("Please enter a valid number!");
        }
    }
}
package com.pluralsight.activities;

import java.util.Scanner;

public class simple_calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exitProgram = false;

        while (!exitProgram) {
            printMenu();

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting program...");
                exitProgram = true;
                continue;
            }

            System.out.print("Enter first number: ");
            double leftValue = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double rightValue = scanner.nextDouble();

            double result = calculate(choice, leftValue, rightValue);

            System.out.println("Result: " + result);
            System.out.println(); // spacing
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("""
                Please select from below choices:
                1 - Add
                2 - Subtract
                3 - Multiply
                4 - Divide
                5 - Exit the program
                """);
    }

    private static double calculate(int choice, double leftValue, double rightValue) {
        switch (choice) {
            case 1:
                return leftValue + rightValue;
            case 2:
                return leftValue - rightValue;
            case 3:
                return leftValue * rightValue;
            case 4:
                if (rightValue == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    return 0;
                }
                return leftValue / rightValue;
            default:
                System.out.println("Invalid choice.");
                return 0;
        }
    }
}
package com.pluralsight;

import java.util.Scanner;

public class simple_calculator_with_stringSupport {
    static void main(String[] args) {
        if (args.length == 3) {
            double leftValue = Double.parseDouble(args[0]);
            char operationCode = args[1].charAt(0);
            double rightValue = Double.parseDouble(args[2]);
            double results = calculate(operationCode, leftValue, rightValue);
            System.out.println(results);
        } else {
            execInteract();
        }
    }

    static void execInteract() {
        System.out.println("Enter first number and operation then second number (e.g, 1 x 1)");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);
    }

    static void performOperation(String[] parts) {
        double leftVal = Double.parseDouble(parts[0]);
        char choice = parts[1].charAt(0);
        double rightVal = Double.parseDouble(parts[2]);
        double result = calculate(choice, leftVal, rightVal);

        System.out.println(result);
    }

    static double calculate(char choices, double leftValue, double rightValue) {
        double results = 0.0d;
        switch(choices) {
            case '+':
                results = leftValue + rightValue;
                break;
            case '-':
                results = leftValue - rightValue;
                break;
            case 'x':
                results = leftValue * rightValue;
                break;
            case '/':
                if (rightValue != 0) {
                    results = leftValue / rightValue;
                }
                break;
            default:
                System.out.println("Invalid choice");
                results = 0.0d;
                break;
        }
        return results;
    }
}

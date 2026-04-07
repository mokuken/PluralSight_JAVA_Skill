package com.pluralsight;

public class simple_calculator_with_arguments {
    static void main(String[] args) {
        if (args.length == 3) {
            double leftValue = Double.parseDouble(args[0]);
            char operationCode = args[1].charAt(0);
            double rightValue = Double.parseDouble(args[2]);
            double results = calculate(operationCode, leftValue, rightValue);
            System.out.println(results);
        } else {
            System.out.println("Please provide order 2 numeric number and a operation code (e.g: 2 + 2");
        }
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

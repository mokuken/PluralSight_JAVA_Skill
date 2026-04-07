package com.pluralsight;

public class simple_calculator_with_method {
    public static void main(String[] args) {
        double[] leftValue = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightValue = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] choices = {'d', 'a', 's', 'm'};
        double[] results = new double[choices.length];

        for (int index = 0; index < choices.length; index++) {
            results[index] = calculate(choices[index],leftValue[index], rightValue[index]);
        }

        // for-each loop
        for (double currentResults : results) {
            System.out.println(currentResults);
        }
    }

    static double calculate(char choices, double leftValue, double rightValue) {
        double results = 0.0d;
        switch(choices) {
            case 'a':
                results = leftValue + rightValue;
                break;
            case 's':
                results = leftValue - rightValue;
                break;
            case 'm':
                results = leftValue * rightValue;
                break;
            case 'd':
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

package com.pluralsight;

public class simple_calculator {
    public static void main(String[] args) {
        double value1 = 25.0d;
        double value2 = 5.0d;
        double result = 0d;
        char choice = 'd';

        if (choice == 'a') {
            result = value1 + value2;
        } else if (choice == 's') {
            result = value1 - value2;
        } else if (choice == 'm') {
            result = value1 * value2;
        } else if (choice == 'd') {
            if (value2 != 0) {
                result = value1 / value2;
            }
        } else {
            System.out.println("Please enter a valid character.");
        }
        System.out.println(result);
    }


}

package com.pluralsight.activities;

public class ArrayExercise {
    public static void main(String[] args) {
        int[] arrayOfIntegers = new int[15];
        arrayOfIntegers[0] = 1;
        int sum = 0;

        // Fill array with values
        for (int i = 1; i < arrayOfIntegers.length; i++) {
            arrayOfIntegers[i] = arrayOfIntegers[i - 1] * 2;
        }

        // Print values
        int averageAll = 0;
        for (int currentInt : arrayOfIntegers) {
            System.out.println(currentInt);
            sum = +currentInt;
            averageAll = sum / 15;
        }

        System.out.println("\n sum of all inputs: " + sum);
        System.out.println("\n average: " + averageAll);
    }
}
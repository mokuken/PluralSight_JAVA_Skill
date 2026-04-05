package com.pluralsight;

public class parallel_arrays {
    public static void main(String[] args) {
        double[] leftValue = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightValue = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] choices = {'d', 'a', 's', 'm'};
        double[] results = new double[choices.length];

        for (int index = 0; index < choices.length; index++) {
            switch(choices[index]) {
                case 'a':
                    results[index] = leftValue[index] + rightValue[index];
                    break;
                case 's':
                    results[index] = leftValue[index] - rightValue[index];
                    break;
                case 'm':
                    results[index] = leftValue[index] * rightValue[index];
                    break;
                case 'd':
                    if (rightValue[index] != 0) {
                        results[index] = leftValue[index] / rightValue[index];
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
                    results[index] = 0.0d;
                    break;
            }
        }

        // for-each loop
        for (double currentResults : results) {
            System.out.println(currentResults);
        }
    }
}

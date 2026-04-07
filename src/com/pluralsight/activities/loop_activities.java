package com.pluralsight.activities;

public class loop_activities {
    static void main() {

        System.out.println("\nActivitiy 1.1");
        for (int i = 1; i < 6; i++) {
            System.out.print(i);
            for (int j = 6 - i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nActivitiy 1.2s");
        for (int i = 1; i < 6; i++) {
            for (int j = 6 - i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nActivitiy 1.3");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1 - i; j <= 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nActivitiy 1.4");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int n = 6 - i; n >= 1; n--) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("\nActivitiy 1.5");
        for (int i = 1; i <= 6; i++) {
            for (int n = 6 - i; n >= 1; n--) {
                System.out.print(n);
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("&");
            }
            System.out.println();
        }

    }
}

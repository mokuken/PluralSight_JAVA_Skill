package com.pluralsight;

public class exit_method {
    static void showSum(float x, float y, int count) {
        if (count < 1) {
            return; // exit method
        }

        float sum = x + y;
        for (int i = 0; i < count; i++) {
            System.out.println(sum);
        }
        return;
    }

    public static void main(String[] args) {
        showSum(7.5f, 1.4f, 3);
    }
}

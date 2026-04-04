package com.pluralsight;

public class conditional_assignment {
    public static void main(String[] args) {
        int value1 = 7;
        int value2 = 5;

        // result = condition ? true-value : false-value ;
        int maxValue = value1 > value2 ? value1 : value2;

        System.out.println(maxValue);
    }
}

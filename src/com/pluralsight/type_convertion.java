package com.pluralsight;

public class type_convertion {
    public static void main(String[] args) {
        // implicit type convertion
        int intValueOne = 50;
        long longValueOne = intValueOne;

        // Explicit type convertion
        long longValueTwo = 50;
        int intValueTwo = (int) longValueTwo;

        // to make the two explicit
        short intValueThree = (short) (longValueOne + longValueTwo);

        // closer look to type convertion
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result1 = (short) longVal;
        short result2 = (short) (byteVal + longVal);
        float result3 = longVal - floatVal; // better to use float if you have a value of float
    }
}

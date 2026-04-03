package com.pluralsight;

public class arithmetic_operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        // basic operators
        // +, -, *, /, %

        // prefix and postfix operators
        int someValue = 5;
        System.out.println(++someValue);
        System.out.println(someValue);
        int anotherValue = 5;
        System.out.println(anotherValue++);
        System.out.println(anotherValue);

        // Compound operations
        int myOtherValue = 100;

        int val1 = 5;
        int val2 = 10;

        myOtherValue /= val1 * val2;
        System.out.println(myOtherValue);
    }
}

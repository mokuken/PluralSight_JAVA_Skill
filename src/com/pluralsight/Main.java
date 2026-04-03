package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        // display a text if 3 lines of code
        System.out.println("First line from app"); /* first */
        System.out.println("And this is the second line from app"); /* second */
        System.out.println("And the third line from app");

        /* print all the:
            First Line
            Second Line
            Third Line
        */

        // primitive data types

        // integer types
        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 2147483647;
        long longValue = 9223372036854775807L;

        // floating point types
        float floatValue = 3.4028235e38f;
        double doubleValue = 1.7976931348623157e308;

        // character type
        char charValue = 'U';

        // boolean type
        boolean booleanTrueValue = true;
        boolean booleanFalseValue = false;



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
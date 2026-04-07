package com.pluralsight;

public class string_concatenation_vs_formatting {
    static void main() {
        int harly = 22, quimjay = 20, jayde = 16;
        String name = "jayde";


        // Concatenation
        String v1 =
                "me and my siblings are " + harly + ", " + quimjay + ", and " + jayde + " years old";

        // String formatting
        String v2 = String.format(
                "me and my siblings are %d, %d, and %d years old",
                harly, quimjay, jayde
        );


        // % is convertion, heres are some of the common format convertions/
        // %d = decimal ex: 32 result 32
        // %x or %X = Hex  ex: 32 result: 20
        // %f = decimal float  ex: 123.0 result 123.000000
        // %e or %E = Scientific notation floating point ex: 123.0 result 1.230000e+02
        // %s = String ex: "Hello" result: Hello

        int ageDiff = harly - jayde;
        String v3 = String.format(
                "I'm %d years older than %s",
                ageDiff, name
        );


        // format flags
        // # = include the radix of the hex code ex: 32 old result: 20 new result: 0x20
        // 0 to 1,2,... = padding ex:
        String v4 = String.format(
                "%19s years old",
                jayde
        ); // it will move to the right and create empty space ot he left but if you add %019d for the numbers the empty space become 0

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);

        // , = grouping seperator

        int moneyOne = 1234567;
        double moneyTwo = 12345670.0d;
        String s1 = String.format("%d", moneyOne);
        String s2 = String.format("%,d", moneyOne); // seperate to with  comma
        String s3 = String.format("%,.2f", moneyTwo); // to include decima
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

package com.pluralsight;

public class block_statement {
    static void main(String[] args) {
        int v1 = 10, v2 = 5;
        final int diff;

        // this works without bracket beacuse if state on allows one line
        if (v1 > v2)
            System.out.println(v1 + "is greater than" + v2);
        else
            System.out.println(v2 + "is greater than" + v1);

        // use bracket if you have multiple statements inside a for
        if (v1 > v2) {
            diff = v1 - v2;
            System.out.println(v1 + "is greater than" + v2 + " = " + diff);
        } else {
            diff = v2 - v1;
            System.out.println(v2 + "is greater than" + v1 + " = " + diff);
        }
    }
}

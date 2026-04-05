package com.pluralsight;

public class while_loop {
    public static void main(String[] args) {
        int someValue = 3;


        // Only runs the in block statements when the condition is always true
        while (someValue != 0) {
            System.out.println("working");
            someValue--;
        }
    }
}

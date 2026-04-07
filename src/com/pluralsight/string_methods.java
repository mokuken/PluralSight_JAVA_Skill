package com.pluralsight;

public class string_methods {
    public static void main() {
        String word = "Hello, everyone in the";

        // length
        word.length();

        // Create new string(s) from existing
        word.concat(", World!"); // output Hello, World!
        word.replace("o", "i"); // output Helli
        word.toLowerCase(); // output hello
        word.toUpperCase(); // output HELLO
        word.trim(); // trim() is used to remove whitespace (spaces, tabs, newline characters) from the beginning and end of a string.
        String[] splittedWord = word.split(", "); // is used to break a string into parts based on a delimiter (like space, comma, etc.).s

        for (String each: splittedWord) {
            System.out.println(each);
        }
    }

}

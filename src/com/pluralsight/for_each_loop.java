package com.pluralsight;

public class for_each_loop {
    public static void main(String[] args) {
        String[] someWords = {"day", "night", "morning", "afternoon", "evening"};

        for (String currentWord : someWords) {
            System.out.println(currentWord);
        }
    }
}

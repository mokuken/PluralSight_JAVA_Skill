package com.pluralsight;

public class arrays {
    public static void main(String[] args) {
        String[] words = new String[5];
        words[0] = "morning";
        words[1] = "afternoon";
        words[2] = "Day";
        words[3] = "Night";

        boolean exists = false;

        for (int i = 0; i < words.length; i++) {
            if ("evening".equals(words[i])) {
                exists = true;
                break;
            }
        }

        if (!exists) {
            words[4] = "evening";
        }

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}

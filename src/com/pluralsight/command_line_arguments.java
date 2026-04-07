package com.pluralsight;

public class command_line_arguments {
    public static void main(String[] args) {
        int i = 0;

        while (i < args.length) {
            String command = args[i];

            switch (command) {
                case "name":
                    if (i + 1 < args.length) {
                        System.out.println(args[i + 1]);
                        i += 2;
                    } else {
                        System.out.println("missing value");
                        i++;
                    }
                    break;
                case "hello":
                    System.out.println("Hello there!");
                    i++;
                    break;

                default:
                    System.out.println("Unknown: " + command);
                    i++;
            }
        }
    }
}
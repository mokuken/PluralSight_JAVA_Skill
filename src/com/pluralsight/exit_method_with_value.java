package com.pluralsight;

public class exit_method_with_value {
    // method with parameters
    static String showName(String firstName,String middleName, String lastName) {
        String completeName = firstName + " " + middleName + " " + lastName;
        return completeName;
    }

    public static void main(String[] args) {

        // calling the method passing parameters
        String name = showName("Harly Khen", "Villasis", "Quimelat");
        System.out.println(name);
    }
}

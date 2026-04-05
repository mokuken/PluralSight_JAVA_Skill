package com.pluralsight;

public class method_with_parameters {

    // method with parameters
    static void completeName(String firstName,String middleName, String lastName) {
        String completeName = firstName + " " + middleName + " " + lastName;
        System.out.println(completeName);
    }

    public static void main(String[] args) {

        // calling the method passing parameters
        completeName("Harly Khen", "Villasis", "Quimelat");
    }
}

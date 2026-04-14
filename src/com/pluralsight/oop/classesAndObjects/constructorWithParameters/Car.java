package com.pluralsight.oop.classesAndObjects.constructorWithParameters;

public class Car {
    public String brand = null;
    public String model = null;
    public String color = null;


    // The constructors are the two methods that have the same name as the class
    public Car(String theBrand, String theModel, String theColor) {
        brand = theBrand;
        model = theModel;
        color = theColor;
    }
}

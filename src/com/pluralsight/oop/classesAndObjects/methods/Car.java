package com.pluralsight.oop.classesAndObjects.methods;

public class Car {
    public String brand = null;
    public String model = null;
    public String color = null;

    // A Java method contains Java instructions that
    // typically perform some operations on a field in the class,
    // or on one of the parameters (also variables) values passed to
    // the method when the method was called.

    public void setColor(String newColor) {
        this.color = newColor;
    }
}

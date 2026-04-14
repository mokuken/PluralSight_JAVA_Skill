package com.pluralsight.oop.classesAndObjects.constructorWithParameters;

public class Main {
    public static void main(String[] args) {

        // object
        Car car1 = new Car("Toyota", "2003", "Black");

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.color);
    }
}

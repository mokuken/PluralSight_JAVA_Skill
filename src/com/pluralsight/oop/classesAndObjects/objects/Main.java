package com.pluralsight.oop.classesAndObjects.objects;

public class Main {
    public static void main(String[] args) {

        // the Car class in the previous section is a template for how Car objects look.

        // these car1 to car3 are objects of a certain class you use new keyword.
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();


        // After creating the 3 Car objects, the setColor() method is called on each object.
        // Now the color (represented as a text) is set individually for each Car object.
        car1.setColor("red");
        car2.setColor("green");
        car3.setColor("yello");

        System.out.println(car1.color);
        System.out.println(car2.color);
        System.out.println(car3.color);
    }
}

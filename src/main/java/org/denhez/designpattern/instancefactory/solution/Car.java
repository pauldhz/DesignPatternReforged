package org.denhez.designpattern.instancefactory.solution;

public class Car implements Vehicle {

    String color;

    public Car(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }
}

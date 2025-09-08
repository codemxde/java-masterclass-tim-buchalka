package org.codemxde.section_7_mastering_oop_classes_and_inheritance.lecture_77;

public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public void describeCar() {
        System.out.println(doors + "-Door " + color + " " + make + " " + model + (convertible ? " Convertible" : ""));
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.describeCar();
    }
}

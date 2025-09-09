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

    public void setMake(String make) {
        // adding some validation logic
        if (make == null) make = "unknown";
        String lowercaseMake = make.toLowerCase();

        switch (lowercaseMake) {
            case "tesla", "porsche", "holden" -> this.make = make;
            default -> this.make = "Unsupported";
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.describeCar();
    }
}

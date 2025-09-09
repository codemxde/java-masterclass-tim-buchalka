package org.codemxde.section_7_mastering_oop_classes_and_inheritance.lecture_78;

import org.codemxde.section_7_mastering_oop_classes_and_inheritance.lecture_77.Car;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();

        // Lecture 79 setter methods
        car.setMake("Porsche");
        car.setMake("Maserati");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("Black");

        car.describeCar();
    }
}

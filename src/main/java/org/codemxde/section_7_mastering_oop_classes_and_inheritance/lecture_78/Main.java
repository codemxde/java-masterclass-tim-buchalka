package org.codemxde.section_7_mastering_oop_classes_and_inheritance.lecture_78;

import org.codemxde.section_7_mastering_oop_classes_and_inheritance.lecture_77.Car;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.describeCar();
        System.out.println(car.getMake() + " " + car.returnMake());
    }
}

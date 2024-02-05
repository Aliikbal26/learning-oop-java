package oop.application;

import oop.annotation.Fancy;
import oop.data.Avanza;
import oop.data.Car;

@Fancy(name = "OOP Application", tags = { "application", "java" })
public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}

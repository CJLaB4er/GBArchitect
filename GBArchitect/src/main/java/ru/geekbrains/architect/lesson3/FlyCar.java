package main.java.ru.geekbrains.architect.lesson3;

import main.java.ru.geekbrains.architect.lesson1.modelElements.Color;

public class FlyCar extends Car {
    public FlyCar(String make, String model, String color) {
        super(make, model, color);
        setWheelsCount(4);
    }

    public void fly() {
        System.out.println("Автомобиль летит!");
    }

    @Override
    public void movement() {
        fly();
    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadLights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }
}

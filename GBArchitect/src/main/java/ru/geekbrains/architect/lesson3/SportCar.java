package main.java.ru.geekbrains.architect.lesson3;

import main.java.ru.geekbrains.architect.lesson1.modelElements.Color;

public class SportCar extends Car{
    public SportCar(String make, String model, String color) {
        super(make, model, color);
        setWheelsCount(3);

    }

    @Override
    public void movement() {

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

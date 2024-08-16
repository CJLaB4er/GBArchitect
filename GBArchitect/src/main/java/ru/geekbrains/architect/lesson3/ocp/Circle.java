package main.java.ru.geekbrains.architect.lesson3.ocp;

public class Circle implements Shape {

    private final double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

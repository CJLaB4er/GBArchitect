package main.java.ru.geekbrains.architect.lesson3.ocp;

public class Square implements Shape {

    private final double side;

    public double getSide() {
        return side;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}

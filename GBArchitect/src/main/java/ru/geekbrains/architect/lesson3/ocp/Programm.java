package main.java.ru.geekbrains.architect.lesson3.ocp;

import java.util.ArrayList;
import java.util.List;

public class Programm {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        shapes.add(new Circle(3));

        double sumArea = 0;

        for (Shape shape : shapes) {
            sumArea += shape.getArea();
        }

        System.out.println(sumArea);
    }
}

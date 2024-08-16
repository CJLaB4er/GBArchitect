package main.java.ru.geekbrains.architect.lesson3.ocp;

public class RightTriangle implements Shape {

    private double katet1;

    private double katet2;

    private double gipotenuza;

    public double getKatet1() {
        return katet1;
    }

    public double getKatet2() {
        return katet2;
    }

    public double getGipotenuza() {
        return gipotenuza;
    }

    public RightTriangle(double katet1, double katet2) {
        this.katet1 = katet1;
        this.katet2 = katet2;
        this.gipotenuza = Math.sqrt(Math.pow(katet1, 2) + Math.pow(katet2, 2));
    }

    @Override
    public double getArea() {
        return katet1 * katet2 / 2.0;
    }

}

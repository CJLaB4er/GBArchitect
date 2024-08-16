package main.java.ru.geekbrains.architect.lesson3;

public class CarWash implements Wiping {
    @Override
    public void wipMirrors(CarType carType) {
        System.out.printf("Автомобилю %s протёрли зеркала\n", carType);
    }

    @Override
    public void wipWindshield(CarType carType) {
        System.out.printf("Автомобилю %s помыли лобовое стекло\n", carType);
    }

    @Override
    public void wipHeadlights(CarType carType) {
        System.out.printf("Автомобилю %s протёрли фары.\n", carType);
    }
}

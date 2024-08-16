package main.java.ru.geekbrains.architect.lesson3;

public class RefuelingStation implements Refueling{


    @Override
    public void fuel(FuelType fuelType) {
        switch (fuelType) {
            case FuelType.Diesel -> System.out.println("Заправка дизельным топливом");
            case FuelType.Gasoline -> System.out.println("Заправка бензином");
}
    }
}

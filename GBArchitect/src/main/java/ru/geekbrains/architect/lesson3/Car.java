package main.java.ru.geekbrains.architect.lesson3;

import main.java.ru.geekbrains.architect.lesson1.modelElements.Color;

public abstract class Car {


    //region Public Methods

    // Движение
    public abstract void movement();

    // Обслуживание
    public abstract void maintenance();

    // Переключение передач
    public abstract boolean gearShifting();

    // Включение фар
    public abstract boolean switchHeadLights();

    // Включение дворников
    public abstract boolean switchWipers();

    // Переключение противотуманных фар
    public boolean switchFogLights(){
        fogLights = !fogLights;
        return fogLights;
    }

    // Получение количества колёс
    public int getWheelsCount() {
        return this.wheelsCount;
    }

    //endregion

    //region Private Methods

    protected void setWheelsCount(int count) {
        this.wheelsCount = count;
    }

    //endregion

    //region Constructors

    public Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }


    //endregion

    //region Private Fields

    // Марка автомобиля
    private String make;

    // Модель
    private String model;

    // Цвет
    private String color;

    // Тип
    protected CarType type;

    // Число колёс
    private int wheelsCount;

    // Тип топлива
    protected FuelType fuelType;

    // Тип коробки передач
    private GearboxType gearboxType;

    // Объём двигателя
    private double engineCapacity;

    // Состояние противотуманных фар
    private boolean fogLights;

    //endregion

}

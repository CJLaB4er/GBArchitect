package main.java.ru.geekbrains.architect.lesson3;

public class Harvester extends Car implements Fueling, WipingCar {
    private Refueling refueling;
    private Wiping wiping;

    public Harvester(String make, String model, String color) {
        super(make, model, color);
        this.fuelType = FuelType.Diesel;
        this.type = CarType.Tractor;
        setWheelsCount(6);
    }

    public void setRefueling(Refueling refueling) {
        this.refueling = refueling;
    }

    public void setWiping(Wiping wiping) {
        this.wiping = wiping;
    }

    /**
     * Заправить автомобиль
     */
    @Override
    public void fuel() {
        if (refueling != null) {
            refueling.fuel(fuelType);
        }
    }

    public void sweeping() {
        System.out.println("Автомобиль подметает улицу.");
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

    @Override
    public void wipMirrors() {
        if (wiping != null) {
            wiping.wipMirrors(type);
        }
    }

    @Override
    public void wipWindshield() {
        if (wiping != null) {
            wiping.wipWindshield(type);
        }
    }

    @Override
    public void wipHeadlights() {
        if (wiping != null) {
            wiping.wipHeadlights(type);
        }
    }
}

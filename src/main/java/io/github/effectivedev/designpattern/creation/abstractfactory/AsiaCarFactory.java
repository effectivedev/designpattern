package io.github.effectivedev.designpattern.creation.abstractfactory;

public class AsiaCarFactory {
    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case SMALL:
                car = new SmallerCar(Location.ASIA);
                break;
            case SEDAN:
                car = new SedanCar(Location.ASIA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.ASIA);
                break;
            default:
                break;
        }
        return car;
    }
}


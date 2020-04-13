package com.example.hateoas.factory;

public class CarFactory {

    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case SEDAN:
                car = new SedanCar(model);
                break;
            case SMALL:
                car = new SmallCar(model);
                break;
            case LUXURY:
                car = new LuxuryCar(model);
                break;
            default:
                return null;
        }
        return car;
    }

}

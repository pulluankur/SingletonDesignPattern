package com.example.hateoas.abstractFactory;


public class SedanCar extends Car {

    public SedanCar(Location location) {
        super(CarType.SEDAN, location);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Building Sedan Car");
    }
}

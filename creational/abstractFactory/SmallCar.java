package com.example.hateoas.abstractFactory;

public class SmallCar extends Car {

    public SmallCar(Location location) {
        super(CarType.SMALL, location);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Building Small Car");
    }

}

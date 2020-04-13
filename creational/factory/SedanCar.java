package com.example.hateoas.factory;

public class SedanCar extends Car {

    public SedanCar(CarType model) {
        super(model);
        constructs();
    }

    @Override
    public void constructs() {
        System.out.println("Building Sedan Car");
    }
}

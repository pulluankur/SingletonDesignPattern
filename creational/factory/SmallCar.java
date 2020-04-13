package com.example.hateoas.factory;

public class SmallCar extends Car {

    public SmallCar(CarType model) {
        super(model);
        constructs();
    }

    @Override
    public void constructs() {
        System.out.println("Building Small Car");
    }

}

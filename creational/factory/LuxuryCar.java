package com.example.hateoas.factory;

public class LuxuryCar extends Car {

    public LuxuryCar(CarType model) {
        super(model);
        constructs();
    }

    @Override
    public void constructs() {
        System.out.println("Building Luxury Car");
    }
}

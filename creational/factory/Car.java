package com.example.hateoas.factory;

public abstract class Car {
    private CarType model = null;

    public Car(CarType model) {
        this.model = model;
        arrangeParts();
    }

    public void arrangeParts() {
        //Do common arrange parts for Car at here
    }

    public abstract void constructs();

    public CarType getModel() {
        return model;
    }

    public Car setModel(CarType model) {
        this.model = model;
        return this;
    }
}

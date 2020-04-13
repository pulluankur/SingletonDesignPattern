package com.example.hateoas.prototype;

public class BlueColor implements Color {

    private String name;

    public String getName() {
        return name;
    }

    public BlueColor setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "BlueColor{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public Color getClone() throws CloneNotSupportedException {
        System.out.println("BlueColor class Clone Created");
        return (Color)super.clone();
    }
}

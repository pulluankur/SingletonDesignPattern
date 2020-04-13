package com.example.hateoas.structural.adapter;

public class School {

    public static void main(String[] args) {
        Pen pen = new AdapterPen();
        Assignment assignment = new Assignment();
        assignment.setPen(pen);
        assignment.write("Connect two incompatible interface to communicate with each other");
    }
}

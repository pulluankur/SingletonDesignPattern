package com.example.hateoas.structural.adapter;

public class Assignment {
    private Pen pen;

    public Pen getPen() {
        return pen;
    }

    public Assignment setPen(Pen pen) {
        this.pen = pen;
        return this;
    }

    public void write(String str) {
        pen.write(str);
    }
}

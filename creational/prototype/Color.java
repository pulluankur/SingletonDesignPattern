package com.example.hateoas.prototype;

public interface Color extends Cloneable {
    Color getClone() throws CloneNotSupportedException;
}

package com.example.hateoas.prototype;
import com.example.hateoas.prototype.ColorRegistry.ColorType;
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println(ColorRegistry.getColor(ColorType.BLUE).toString());
        
    }
}

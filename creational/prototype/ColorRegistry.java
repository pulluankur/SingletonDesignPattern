package com.example.hateoas.prototype;

import java.util.HashMap;
import java.util.Map;

public class ColorRegistry {

    static class ColorType {
        public static final String BLUE = "Blue";
    }

    private static Map<String, Color> colorMap = new HashMap<>();

    static {
        colorMap.put(ColorType.BLUE,new BlueColor().setName("Blue"));
    }

    public static Color getColor(String color) throws CloneNotSupportedException {
        return colorMap.get(color).getClone();
    }
}

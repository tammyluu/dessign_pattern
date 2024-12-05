package org.example.factory;

import org.example.Car;
import org.example.Doll;
import org.example.Toy;

import java.awt.*;

public class ToyFactory {
    public static Toy createToy(String toyType) {
        return switch (toyType.toLowerCase()) {
            case "doll" -> new Doll();
            case "car" -> new Car();
           default -> throw new IllegalArgumentException("Unknown toy type: " + toyType);
        };
    }
}

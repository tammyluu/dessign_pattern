package org.example;

public class Car extends Toy {
    public Car() {
        super("Car");
    }

    @Override
    public void assemble() {
        System.out.println("Bingo! We are assembling a car...");
    }
}

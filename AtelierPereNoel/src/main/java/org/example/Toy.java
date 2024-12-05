package org.example;

public abstract class Toy {
    private String name;

    public Toy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void assemble();
}



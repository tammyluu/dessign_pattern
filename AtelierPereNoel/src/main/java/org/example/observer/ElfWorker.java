package org.example.observer;

public class ElfWorker implements Elf{
    private String name;

    public ElfWorker(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}

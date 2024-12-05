package org.example;

import org.example.observer.Elf;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private  final List<Elf> observers = new ArrayList<>();
    public void subscribe(Elf elf) {
        observers.add(elf);
    }
    public void unsubscribe(Elf elf) {
        observers.remove(elf);
    }
    public void notifyObservers(String message) {
        for (Elf elf : observers) {
            elf.update(message);
        }
    }

}

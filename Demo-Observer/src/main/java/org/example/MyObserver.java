package org.example;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Obsever {
    private String name;
    public MyObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "a reçu un message : " + message);
    }
}

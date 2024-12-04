package org.example;

import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observer1 = new MyObserver("observer 1 ");
        Observer observer2 = new MyObserver("observer 2");
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.notifyObservers("un jolie message 1: ");
        subject.notifyObservers("un jolie message 2: ");
        subject.removeObserver(observer2);
        subject.notifyObservers("un jolie message 3: ");
    }
}
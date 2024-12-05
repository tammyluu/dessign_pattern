package org.example;

/**
 * Observateur qui affiche les notifications dans la console.
 */
public class ConsoleObserver implements Observer {
    @Override
    public void update(String event) {
        System.out.println("ConsoleObserver: " + event);
    }
}

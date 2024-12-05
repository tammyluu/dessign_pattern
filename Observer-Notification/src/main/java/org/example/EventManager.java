package org.example;
import java.util.ArrayList;
import java.util.List;


public class EventManager {
    private final List<Observer> observers;

    public EventManager() {
        observers = new ArrayList<>();
    }

    /**
     * Ajoute un observateur à la liste.
     *
     * @param observer L'observateur à ajouter.
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Supprime un observateur de la liste.
     *
     * @param observer L'observateur à supprimer.
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifie tous les observateurs d'un événement.
     *
     * @param event Le message d'événement.
     */
    public void notifyObservers(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }
}

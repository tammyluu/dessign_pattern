package org.example;
public class Main {
    public static void main(String[] args) {

        EventManager eventManager = new EventManager();

        ConsoleObserver consoleObserver = new ConsoleObserver();
        FileObserver fileObserver = new FileObserver("events.log");

        eventManager.addObserver(consoleObserver);
        eventManager.addObserver(fileObserver);

        eventManager.addObserver(new ConsoleObserver());
        eventManager.addObserver(new FileObserver("notifications.log"));


        String newPhoneEvent = "Le nouveau téléphone Tesla PI est disponible en janvier 2005!";
        eventManager.notifyObservers(newPhoneEvent);

        String nextEvent = "Précommandez le Tesla PI avant le 15 décembre pour bénéficier d'une réduction de 10% !";
        eventManager.notifyObservers(nextEvent);
    }
}

